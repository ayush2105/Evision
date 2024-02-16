package InterAndAbstract;

abstract class AbsClass {
    int x,y;
    abstract void getPosition();
    int k;
    AbsClass(){
        this.x=0;
        this.y=0;
    }
}
class Abc extends AbsClass{
    void getPosition(){
        System.out.println("Hello");
    }

}
