package com.example.calcula3;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

//import org.mozilla.javascript.Context;
//import org.mozilla.javascript.Scriptable;


public class MainActivity extends AppCompatActivity {
    TextView visor;
    TextView visor1;
    String tela= "";
    String memo1="";
    String memo2="";


  //  EditText visor;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bsoma,bdividir,bmult,bponto,bsubtrair,bigual ,braiz;
    Button babrepar,bfechapar,blimpa,bdel,bmemo1,bmemo2;

    public String execute(String s) {
        Object result = null;
        String engineName = "js";

        ScriptEngineManager manager = new ScriptEngineManager();

        Log.i("TEST", "using Script engine name: " + engineName);
        ScriptEngine engine = manager.getEngineByName(engineName);


        if (engine == null) {
            throw new UnsupportedOperationException("Engine not found: " + engineName);
        }

        Log.i("TEST", s);

        try {
            result = engine.eval(s);
            return result.toString();
        } catch (Exception e) {
            Log.e("e", e.toString());
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     //   visor= ( EditText)findViewById(R.id.visor);
        visor=findViewById(R.id.visor);
        Double res;
        //res=Math.sqrt(9);
       // visor.setText(res.toString());


        b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View arg0){
     //   double num1=Double.parseDouble    (ednumero1.getText().toString());
     //   double num2=Double.parseDouble   (ednumero2.getText().toString());
     //   double soma=num1-num2;
        //String ola="ola mundo";

            tela=tela.concat("1");
            visor.append("1");


        }
        });
        b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View arg0){
                //   double num1=Double.parseDouble    (ednumero1.getText().toString());
                //   double num2=Double.parseDouble   (ednumero2.getText().toString());
                //   double soma=num1-num2;
                //String ola="ola mundo";
            visor.append("2");
            tela=tela.concat("2");


        }
    });
        b3 = (Button) findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0){
                //   double num1=Double.parseDouble    (ednumero1.getText().toString());
                //   double num2=Double.parseDouble   (ednumero2.getText().toString());
                //   double soma=num1-num2;
                //String ola="ola mundo";
                visor.append("3");
                tela=tela.concat("3");


            }
        });
        b4 = (Button) findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0){
                //   double num1=Double.parseDouble    (ednumero1.getText().toString());
                //   double num2=Double.parseDouble   (ednumero2.getText().toString());
                //   double soma=num1-num2;
                //String ola="ola mundo";
                visor.append("4");
                tela=tela.concat("4");


            }
        });
        b5 = (Button) findViewById(R.id.b5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0){
                //   double num1=Double.parseDouble    (ednumero1.getText().toString());
                //   double num2=Double.parseDouble   (ednumero2.getText().toString());
                //   double soma=num1-num2;
                //String ola="ola mundo";
                visor.append("5");
                tela=tela.concat("5");


            }
        });
        b6 = (Button) findViewById(R.id.b6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0){
                //   double num1=Double.parseDouble    (ednumero1.getText().toString());
                //   double num2=Double.parseDouble   (ednumero2.getText().toString());
                //   double soma=num1-num2;
                //String ola="ola mundo";
                visor.append("6");
                tela=tela.concat("6");


            }
        });
        b7 = (Button) findViewById(R.id.b7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0){
                //   double num1=Double.parseDouble    (ednumero1.getText().toString());
                //   double num2=Double.parseDouble   (ednumero2.getText().toString());
                //   double soma=num1-num2;
                //String ola="ola mundo";
                visor.append("7");
                tela=tela.concat("7");


            }
        });
        b8 = (Button) findViewById(R.id.b8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0){
                //   double num1=Double.parseDouble    (ednumero1.getText().toString());
                //   double num2=Double.parseDouble   (ednumero2.getText().toString());
                //   double soma=num1-num2;
                //String ola="ola mundo";
                visor.append("8");
                tela=tela.concat("8");


            }
        });
        b9= (Button) findViewById(R.id.b9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0){
                //   double num1=Double.parseDouble    (ednumero1.getText().toString());
                //   double num2=Double.parseDouble   (ednumero2.getText().toString());
                //   double soma=num1-num2;
                //String ola="ola mundo";
                visor.append("9");
                tela=tela.concat("9");


            }
        });
        b0 = (Button) findViewById(R.id.b0);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0){
                //   double num1=Double.parseDouble    (ednumero1.getText().toString());
                //   double num2=Double.parseDouble   (ednumero2.getText().toString());
                //   double soma=num1-num2;
                //String ola="ola mundo";
                visor.append("0");
                tela=tela.concat("0");


            }
        });
        bsoma = (Button) findViewById(R.id.bsoma);
        bsoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0){
                //   double num1=Double.parseDouble    (ednumero1.getText().toString());
                //   double num2=Double.parseDouble   (ednumero2.getText().toString());
                //   double soma=num1-num2;
                //String ola="ola mundo";
                visor.append("+");
                tela=tela.concat("+");


            }
        });
        bmult = (Button) findViewById(R.id.bmult);
        bmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0){
                //   double num1=Double.parseDouble    (ednumero1.getText().toString());
                //   double num2=Double.parseDouble   (ednumero2.getText().toString());
                //   double soma=num1-num2;
                //String ola="ola mundo";
                visor.append("*");
                tela=tela.concat("*");


            }
        });
        bsubtrair = (Button) findViewById(R.id.bsubtrair);
        bsubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0){
                //   double num1=Double.parseDouble    (ednumero1.getText().toString());
                //   double num2=Double.parseDouble   (ednumero2.getText().toString());
                //   double soma=num1-num2;
                //String ola="ola mundo";
                visor.append("-");
                tela=tela.concat("-");


            }
        });
        bponto = (Button) findViewById(R.id.bponto);
        bponto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0){
                //   double num1=Double.parseDouble    (ednumero1.getText().toString());
                //   double num2=Double.parseDouble   (ednumero2.getText().toString());
                //   double soma=num1-num2;
                //String ola="ola mundo";
                visor.append(".");
                tela=tela.concat(".");




            }
        });
        bdividir = (Button) findViewById(R.id.bdividir);
        bdividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0){
                //   double num1=Double.parseDouble    (ednumero1.getText().toString());
                //   double num2=Double.parseDouble   (ednumero2.getText().toString());
                //   double soma=num1-num2;
                //String ola="ola mundo";
                visor.append("/");
                tela=tela.concat("/");


            }
        });
        braiz = (Button) findViewById(R.id.braiz);
        braiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0){
                //   double num1=Double.parseDouble    (ednumero1.getText().toString());
                //   double num2=Double.parseDouble   (ednumero2.getText().toString());
                //   double soma=num1-num2;
                //String ola="ola mundo";
                //visor1=visor;
                //visor.append("Raiz(");

                visor.append("Raiz(");


                tela=tela.concat("Math.sqrt(");


            }
        });
        babrepar = (Button) findViewById(R.id.babrepar);
        babrepar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0){
                //   double num1=Double.parseDouble    (ednumero1.getText().toString());
                //   double num2=Double.parseDouble   (ednumero2.getText().toString());
                //   double soma=num1-num2;
                //String ola="ola mundo";
                visor.append("(");
                tela=tela.concat("(");


            }
        });
        bfechapar = (Button) findViewById(R.id.bfechapar);
        bfechapar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0){
                //   double num1=Double.parseDouble    (ednumero1.getText().toString());
                //   double num2=Double.parseDouble   (ednumero2.getText().toString());
                //   double soma=num1-num2;
                //String ola="ola mundo";
                visor.append(")");
                tela=tela.concat(")");


            }
        });
        blimpa = (Button) findViewById(R.id.blimpa);
        blimpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0){
                //   double num1=Double.parseDouble    (ednumero1.getText().toString());
                //   double num2=Double.parseDouble   (ednumero2.getText().toString());
                //   double soma=num1-num2;
                //String ola="ola mundo";
                visor.setText("");
                tela="";


            }
        });
        bmemo1 = (Button) findViewById(R.id.bmemo1);
        bmemo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0){
                //   double num1=Double.parseDouble    (ednumero1.getText().toString());
                //   double num2=Double.parseDouble   (ednumero2.getText().toString());
                //   double soma=num1-num2;
                //String ola="ola mundo";
                memo1=tela;
                memo2=visor.getText().toString();



            }
        });
        bmemo2 = (Button) findViewById(R.id.bmemo2);
        bmemo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0){
                //   double num1=Double.parseDouble    (ednumero1.getText().toString());
                //   double num2=Double.parseDouble   (ednumero2.getText().toString());
                //   double soma=num1-num2;
                //String ola="ola mundo";
                visor.append(memo2);
                tela=tela.concat(memo1);


            }
        });
        bdel= (Button) findViewById(R.id.bdel);
        bdel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0){
                //   double num1=Double.parseDouble    (ednumero1.getText().toString());
                //   double num2=Double.parseDouble   (ednumero2.getText().toString());
                //   double soma=num1-num2;
                //String ola="ola mundo";
              //  tela=tela.concat("Ferrari");
                visor.setText(tela);


            }
        });
       // bdel = (Button) findViewById(R.id.bdel);

        bigual = (Button) findViewById(R.id.bigual);


        bigual.setOnClickListener(new View.OnClickListener() {
            String exp="                     ";
            double res;



            String responder;

            double result;

            // Here argument is negative,
            // output will be NaN


            @Override
            public void onClick(View arg0){
                //   double num1=Double.parseDouble    (ednumero1.getText().toString());
                //   double num2=Double.parseDouble   (ednumero2.getText().toString());
                //   double soma=num1-num2;
                //String ola="ola mundo";
                exp= visor.getText().toString();
               // exp="Math.sqrt(81)+10";
                ScriptEngineManager manager = new ScriptEngineManager();
                ScriptEngine engine = manager.getEngineByName("js");
               //  exp=engine.eval("3+2");
               // try{
                //    String conta = "Math.sqrt(81)*(5+((3+1)/6))";
              // visor.setText(execute(exp));
                visor.setText(execute(tela));
                tela=execute(tela);
             //   visor=visor1;
               // tela=visor.getText().toString();
                   // System.out.println("Resultado de "+conta+" = "+engine.eval(conta));
               // }catch(Exception e){

               // }


            }
        });


    }
}