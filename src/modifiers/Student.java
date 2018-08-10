package modifiers;

/**
 * Created by expertzlab12 on 6/11/18.
 */
 class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("id:" + id);
        System.out.println("name:" + name);
    }

}
