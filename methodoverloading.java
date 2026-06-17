public class methodoverloading {

    int add(int a,int b){
        if(a==0 && b==0){
             System.out.println("value can't be zero");
        }
        return (a+b);
    }

    int add(int a,int b,int c){
         if(a==0 && b==0&&c==0){
            System.out.println("value can't be zero");
        }
        return (a+b+c);
    }
    double add(double a,double b,double c){
         if(a==0 && b==0 && c==0){
            System.out.println("value can't be zero");
        }
        return (a+b+c);
    }
    public static void main(String[] args) {
        methodoverloading mo=new methodoverloading();
       int x= mo.add(0,0);
        int y=mo.add(5,6,8);
        double z=mo.add(4.5,5.2,6.2);

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        
    }
}
