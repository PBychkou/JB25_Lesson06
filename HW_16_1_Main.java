import java.util.List;

public class HW_16_1_Main {

    public static void main(String[] args) {

        HW_16_1_Group group = new HW_16_1_Group();

        HW_16_1_Student student01 = new HW_16_1_Student("Peter", "Sagan", 5, 5, 5, 5, 5);
        group.addStudent(student01);

        HW_16_1_Student student02 = new HW_16_1_Student("Mikel", "Landa", 2, 2, 2, 2, 2);
        group.addStudent(student02);

        HW_16_1_Student student03 = new HW_16_1_Student("Nairo", "Quintana", 2, 5, 2, 5, 2);
        group.addStudent(student03);

        HW_16_1_Student student04 = new HW_16_1_Student("Tom", "Dumoulin", 2, 2, 2, 2, 2);
        group.addStudent(student04);

        HW_16_1_Student student05 = new HW_16_1_Student("Chris", "Froome", 2, 3, 4, 5, 5);
        group.addStudent(student05);

        HW_16_1_GroupImpl groupImpl = new HW_16_1_GroupImpl();

        groupImpl.calculateAvgStudentMark(group);

        double AvgGroupMark = groupImpl.calculateAvgGroupMark(group);
        System.out.println("AvgGroupMark = " + AvgGroupMark);

        int topPerformers = groupImpl.calculateTopPerformers(group);
        System.out.println("TopPerformers amount = " + topPerformers);

        int lowPerformers = groupImpl.calculateLowPerformers(group);
        System.out.println("LowPerformers amount = " + lowPerformers);

    }
}