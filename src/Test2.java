public class Test2 {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "Mithu";
        t.age = 43;
        t.qualification = "Engineer";

        t.displayInformation();


        Person p = new Person();
        p.name = "Mithu";
        p.age = 43;
       // t.qualification = "Engineer"; এইটা কল করতে পারবো না কারন এইটা Person class এইটা define করা হয়নি।

        p.displayInformation();
    }
}
