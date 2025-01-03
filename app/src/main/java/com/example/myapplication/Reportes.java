package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class Reportes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.act_reportes);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        /** MENU LATERAL **/
        Spinner menuLateral=findViewById(R.id.menuLateral);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.menu,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        menuLateral.setAdapter(adapter);
        /** FIN MENU LATERAL **/
        menuLateral.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            /** METODO PARA  SELECCIONAR ALGÚN ELEMENTO DEL MENÚ **/
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                /** SI SE SELECCIONA EL TEXTO INICIO SE PASA A LA PANTALLA DE INICIO **/
                if (adapterView.getItemAtPosition(i).equals ("Inicio")){
                    Intent inicio = new Intent(Reportes.this, MenuPrinc.class);
                    startActivity(inicio);
                }  /** FIN CÓDIGO BOTÓN INICIO MENÚ   **/

                /** SI SE SELECCIONA EL TEXTO INGRESOS SE PASA A LA PANTALLA DE INGRESOS **/
                if (adapterView.getItemAtPosition(i).equals ("Ingresos")){
                    Intent ingresos = new Intent(Reportes.this, Ingresos.class);
                    startActivity(ingresos);
                }  /** FIN CÓDIGO BOTÓN INGRESOS MENÚ   **/

                /** SI SE SELECCIONA EL TEXTO INICIO SE PASA A LA PANTALLA DE EGRESOS **/
                if (adapterView.getItemAtPosition(i).equals ("Egresos")){
                    Intent egresos = new Intent(Reportes.this, Egresos.class);
                    startActivity(egresos);
                }  /** FIN CÓDIGO BOTÓN EGRESOS MENÚ   **/

                /** SI SE SELECCIONA EL TEXTO INICIO SE PASA A LA PANTALLA DE NOTAS **/
                if (adapterView.getItemAtPosition(i).equals ("Notas")){
                    Intent notas = new Intent(Reportes.this, Notas.class);
                    startActivity(notas);
                }  /** FIN CÓDIGO BOTÓN NOTAS MENÚ   **/

                /** SI SE SELECCIONA EL TEXTO INICIO SE PASA A LA PANTALLA DE PLANEACIÓN DE DEUDAS **/
                if (adapterView.getItemAtPosition(i).equals ("Planeación de deudas")){
                    Intent deudas = new Intent(Reportes.this, PlaneacionDeudas.class);
                    startActivity(deudas);
                }  /** FIN CÓDIGO BOTÓN PLANEACION DE DEUDAS MENÚ   **/

                /** SI SE SELECCIONA EL TEXTO INICIO SE PASA A LA PANTALLA DE CATEGORIAS **/
                if (adapterView.getItemAtPosition(i).equals ("Categorias")){
                    Intent categorias = new Intent(Reportes.this, Categorias.class);
                    startActivity(categorias);
                }  /** FIN CÓDIGO BOTÓN CATEGORIAS MENÚ   **/

                /** SI SE SELECCIONA EL TEXTO INICIO SE PASA A LA PANTALLA DE REPORTES **/
                if (adapterView.getItemAtPosition(i).equals ("Reportes")){
                    Intent reportes = new Intent(Reportes.this, Reportes.class);
                    startActivity(reportes);
                }  /** FIN CÓDIGO BOTÓN REPORTES MENÚ   **/
                /** SI SE SELECCIONA EL TEXTO INICIO SE PASA A LA PANTALLA DE META FINANCIERA **/
                if (adapterView.getItemAtPosition(i).equals ("Meta financiera")){
                    Intent metafin = new Intent(Reportes.this, MetaFin.class);
                    startActivity(metafin);
                }  /** FIN CÓDIGO BOTÓN META FINANCIERA MENÚ   **/
                /** SI SE SELECCIONA EL TEXTO INICIO SE PASA A LA PANTALLA DE AYUDA **/
                if (adapterView.getItemAtPosition(i).equals ("Ayuda")){
                    Intent ayuda = new Intent(Reportes.this, Ayuda.class);
                    startActivity(ayuda);
                }  /** FIN CÓDIGO BOTÓN INICIO MENÚ   **/

                /** SI SE SELECCIONA EL TEXTO SE CAMBIA EL COLOR DE LAS PANTALLAS **/
                // if (adapterView.getItemAtPosition(i).equals ("Inicio")){
                //   Intent inicio = new Intent(Ingresos.this, MenuPrinc.class);
                // startActivity(inicio);
                // }  /** FIN CÓDIGO BOTÓN INICIO MENÚ   **/
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        Spinner reporte=findViewById(R.id.reporte);
        ArrayAdapter<CharSequence> a=ArrayAdapter.createFromResource(this,R.array.reporte,android.R.layout.simple_spinner_item);
        a.setDropDownViewResource(android.R.layout.simple_spinner_item);
        reporte.setAdapter(a);
        reporte.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}