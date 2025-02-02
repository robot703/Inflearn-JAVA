package static2.ex;

public class MathArrayUtils {
    private static int result;

    private MathArrayUtils(){

    }

    public static int sum(int[] value){
        for(int a:value){
            result+=a;
        }
        return result;
    }

    public static int average(int[] value){
        result = result/value.length;
        return result;
    }

    public static int min(int[] value){
        result=value[0];
        for(int a:value){
            if(a<result){
                result=a;
            }
        }
        return result;
    }

    public static int max(int[] value){
        result = 0;
        for(int a:value){
            if(a>result){
                result=a;
            }
        }
        return result;
    }


}
