/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ulp;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
/**
 *
 * @author Antonio Assat
 */
public class GestionSemaforosTest {
    //Configuración del Entorno de Pruebas (Ciclo de Vida) 
    private GestionSemaforosService service;
    private Semaforo semaforo;
    @BeforeAll 
    public static void iniciarSuite(){
        System.out.println("Inicio de todas las pruebas");
    }
    @BeforeEach
    public void setup(){

        service = new GestionSemaforosService();

        semaforo = new Semaforo(100,"Averiado","Rivadavia y San Martín","Led");
    }
    
    @AfterEach
    public void teardown(){
        System.out.println("Prueba finalizada");
    }
    
    @AfterAll
    public static void finalizarSuite(){
        System.out.println("Fin de todas las pruebas");
    }
    
    //Prueba de Composición Estricta (Semaforo y Luz) 
    @Test
    public void testComposicionSemaforoLuz(){
        //crear 3 luces y no duplicarlas
        assertEquals(
                3,
                semaforo.getLuces().size()
        );

        Luz luz0 = semaforo.getLuces().get(0);

        assertSame(luz0,semaforo.getLuces().get(0));
    }
    
    // Prueba de Robustez ante Duplicados (assertThrows y @Timeout) 
    
    @Test
    @Timeout(
            value = 400,
            unit = TimeUnit.MILLISECONDS
    )//No debe tardar mas de 400ms
    public void testOrdenDuplicada(){

        Denunciante denunciante =new Denunciante("Juanjo","juanjo@mail.com");

        Denuncia denuncia =new Denuncia(
                                        1,
                                        LocalDate.now(),
                                        "25 de Mayo",
                                        "Colón",
                                        "No funciona",
                                        "Alta",
                                        denunciante,
                                        semaforo
                );

        OrdenComposicion orden1 =new OrdenComposicion(1,LocalDate.now(),"Detalle",denuncia);

        OrdenComposicion orden2 =new OrdenComposicion(2,LocalDate.now(),"Detalle 2",denuncia);

        service.asignarOrden(denuncia,orden1);

        assertThrows(
                OrdenYaAsignadaException.class,
                () -> {
                    service.asignarOrden(
                            denuncia,
                            orden2
                    );
                }
        );
    }
    //Prueba de Flujo de Reparación Exitoso (assertTrue y assertEquals) 
    
    @Test
    public void testFlujoReparacion(){

        EquipoControl equipo =new EquipoControl(1,"Electricidad","Ocupado");

        for(int i=1;i<=4;i++){

            equipo.addMiembro(
                    new Miembro(i,"Miembro"+i,"Tecnico",false)
            );
        }

        equipo.liberarEquipo();

        assertEquals(
                "Libre",
                equipo.getEstado()
        );

        for(Miembro m : equipo.getMiembros()){

            assertTrue(m.isLibre());
        }
    }
    //Prueba Parametrizada de Prioridades (@ParameterizedTest) 
    //prioridades  alta, media, baja
    @ParameterizedTest
    @ValueSource(strings = {
            "Alta",
            "Media",
            "Baja"
    })
    public void testPrioridades(
            String prioridad){

        Denunciante denunciante =new Denunciante("Ana","ana@mail.com");

        Denuncia denuncia =
                new Denuncia(
                        1,
                        LocalDate.now(),
                        "A",
                        "B",
                        "Problema",
                        prioridad,
                        denunciante,
                        semaforo
                );

        assertTrue(denuncia.esPrioridadValida());
    }
    
    //Prueba de Métricas Estadísticas e Historial (assertEquals) 
    @Test
    public void testCantidadDenuncias(){
        //llevar la cuenta de denuncias historicas
        Denunciante denunciante =new Denunciante("Pedro","pedro@mail.com");

        semaforo.addDenuncia(
                new Denuncia(
                        1,
                        LocalDate.now(),
                        "A",
                        "B",
                        "P1",
                        "Alta",
                        denunciante,
                        semaforo
                )
        );

        semaforo.addDenuncia(
                new Denuncia(
                        2,
                        LocalDate.now(),
                        "A",
                        "B",
                        "P2",
                        "Alta",
                        denunciante,
                        semaforo
                )
        );

        semaforo.addDenuncia(
                new Denuncia(
                        3,
                        LocalDate.now(),
                        "A",
                        "B",
                        "P3",
                        "Alta",
                        denunciante,
                        semaforo
                )
        );

        assertEquals(
                3,
                service.obtenerCantidadDenuncias(
                        semaforo
                )
        );
    }
}
