public class HW_16_1_GroupImpl {

    public double calculateAvgGroupMark (HW_16_1_Group group) {
        
        double avgGroupMark = 0, studentsAmt = 0, totalGroupMark = 0;
        
        for (HW_16_1_Student student : group.getStudents()) {
            totalGroupMark += (student.getMarkVolleyBall() + student.getMarkBadminton() + student.getMarkSwimming() + student.getMarkBoxing() + student.getMarkBilliard());
            studentsAmt ++;
        }
        avgGroupMark = totalGroupMark / (studentsAmt * 5);      
        return avgGroupMark;
    }

    public void calculateAvgStudentMark (HW_16_1_Group group) {

        double avgStudentMark = 0;
        int count = 1;

        for (HW_16_1_Student student : group.getStudents()) {
            avgStudentMark = (student.getMarkVolleyBall() + student.getMarkBadminton() + student.getMarkSwimming() + student.getMarkBoxing() + student.getMarkBilliard()) / 5;
            System.out.println(count + ". " + student.getFirstName() + " " + student.getLastName() + ", " + "average mark: " +  avgStudentMark);
            count ++;
        }
    } 

    public int calculateTopPerformers(HW_16_1_Group group) {

        int AmtTopPerformers = 0;

        for (HW_16_1_Student student : group.getStudents()) {

            if (student.getMarkVolleyBall() == 5 && student.getMarkBadminton() == 5 && student.getMarkSwimming() == 5 && student.getMarkBoxing() ==5 && student.getMarkBilliard() ==5) {
                AmtTopPerformers ++;    
            }
        }
        return AmtTopPerformers;
    }

    public int calculateLowPerformers(HW_16_1_Group group) {

        int AmtLowPerformers = 0;

        for (HW_16_1_Student student : group.getStudents()) {

            if (student.getMarkVolleyBall() == 2 || student.getMarkBadminton() == 2 || student.getMarkSwimming() == 2 || student.getMarkBoxing() == 2 || student.getMarkBilliard() == 2) {
                AmtLowPerformers ++;    
            }
        }
        return AmtLowPerformers;
    }

}