package day32_Constructor.encapsulation;

public class Person {

    private String name;
    private int age;

    public String getName(){
        return  name;
    }

     public void setName(String name){
        this.name=name;
     }

     public int getAge(){
        return age;
     }

     public void setAge(int age){
        if(age<=0||age>150){//buraya bir kontrol koyuyoruz bunu public de yapamayız diğer classlarda private olduğu için
            System.err.println("Invalid age");//setter ile çağrılacak ve valid number girilmek zorunda
            System.exit(0);//private ın sahibi biziz bize özel kontrol bizde
        }
        this.age=age;
     }



}
