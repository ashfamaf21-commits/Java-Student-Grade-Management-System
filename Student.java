public class Student {
    

    String name;
    double biology;
    double chemistry;
    double it;

    public Student(String name, double biology,
                   double chemistry, double it) {

        this.name = name;
        this.biology = biology;
        this.chemistry = chemistry;
        this.it = it;
    }

    public double calculateAverage() {

        return (biology + chemistry + it) / 3;
    }

    public String calculateGrade() {

        double average = calculateAverage();

        if (average >= 75) {
            return "A";
        } else if (average >= 65) {
            return "B";
        } else if (average >= 55) {
            return "C";
        } else if (average >= 40) {
            return "S";
        } else {
            return "F";
        }
    }

    public void displayStudent() {

        System.out.println(
            "Name: " + name +
            " | Average: " +
            String.format("%.2f", calculateAverage()) +
            " | Grade: " + calculateGrade()
        );
    }
}