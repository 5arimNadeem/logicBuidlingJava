package logicBuilding.EasyProblems.Practise.OOP;

//package logicBuilding.EasyProblems.Practise.OOP.NormalObjects;
public class ObjectOrientedProgramming {
    int num = 0;

    public ObjectOrientedProgramming(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "ObjectOrientedProgramming {" + "num = " + num +  '}';
    }

    public static void main(String[] args) {
        ObjectOrientedProgramming number = new ObjectOrientedProgramming(3443);
        System.out.println(number);
    }
}
