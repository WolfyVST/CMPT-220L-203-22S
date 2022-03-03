package base;

public class plants {
    boolean needsWatering ;
    String plantFamily ;
    String name ;

    public plants (boolean needsWatering , String plantFamily , String name){
        this.needsWatering = needsWatering;
        this.plantFamily =plantFamily;
        this.name = name ;

        anaunce();
    }

    public void anaunce(){
        System.out.println("Plants");
    }
}


