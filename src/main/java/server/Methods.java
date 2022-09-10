package server;

public class Methods {

    public String calcular(double num, double num2,double num3,double num4){
        double suma = (num + num2 + num3 + num4);
        double producto=(num * num2 * num3 * num4);
        double promedio=((num + num2 + num3 + num4) /4);
        return "Hola, el producto es: "+ producto + " , la suma es: " +suma+ " y el rpomedio es  : "+promedio;
    }
    public String calcular(double num, double num2){
        double suma=0;
        if (num<num2){
            for (double i=num; i<=num2; i++){
                suma=suma + i;
            }

        }else{
            for (double i=num2; i<=num; i++){
                suma=suma + i;
            }

        }
        suma=suma - num -num2;

        return "el resultado es  : "+ suma;
    }

    public String ordenar(int num1, int num2, int num3, int num4, int num5){

        int array[];
        int[] intArray = new int[]{num1,num2,num3,num4,num5};
        int var=0;

        for (int i=0; i<5; i++){

            for (int j=0; j<5-1;j++){

                if(intArray[j]>intArray[j+1]){
                    var=intArray[j];
                    intArray[j]= intArray[j+1];
                    intArray[j+1]=var;
                }
            }
        }


        return "el orden es :"+ intArray[0]+", "+intArray[1]+", "+intArray[2]+", "+intArray[3]+", "+intArray[4];
    }
}
