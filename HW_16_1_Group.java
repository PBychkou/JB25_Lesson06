import java.util.ArrayList;
import java.util.List;

/* import HW_16_1_Student; */

public class HW_16_1_Group {

    private List<HW_16_1_Student> students;

    public HW_16_1_Group() {
        students = new ArrayList<>();
    }

    public void addStudent (HW_16_1_Student student) {
        students.add(student);
    }

    public List<HW_16_1_Student> getStudents() {
        return students;
    }

    public void SetStudents(List<HW_16_1_Student> students){
        this.students = students;
    }
}