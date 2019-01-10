public class MarkerInterfaceExample  {

public static void isMatker(Object object)
{
    if(object instanceof  MyMarker)
    {
        System.out.println("this is marker interafce");
    }else{
        try {
            throw new MyException("this is not marer interace");
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}

    public static void main(String[] args) {

    MyMarkerImpl myMarker=new MyMarkerImpl();
    isMatker(myMarker);
    }
}
