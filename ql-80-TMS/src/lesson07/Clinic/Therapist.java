package lesson07.Clinic;

public class Therapist extends Doctor{
    /*
    Создать программу для имитации работы клиники. Пусть в клинике будет три врача:
хирург, терапевт и дантист. Каждый врач имеет метод «лечить», но каждый врач лечит
по-своему. Так же предусмотреть класс «Пациент» с полем «План лечения» и полем
«Доктор». Создать объект класса «Пациент» и добавить пациенту план лечения. У
терапевта создать метод, который будет назначать врача пациенту согласно плану
лечения:
Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
Если план лечения имеет код 2 – назначить дантиста и выполнить метод лечить.
Если план лечения имеет любой другой код – назначить терапевта и выполнить метод
лечить.
     */

    @Override
    public void treat(){
        System.out.println("I need to take your temperature. " +
                "Afterwards, I'll prescribe you some pills and issue you a sick note.");
    }

    public void appointDoctor(Patient patient){
        if(patient.getTreatmentPlan().equalsIgnoreCase("remove the appendix")){
            System.out.println("In that case, I will assign a surgeon to you.");
            patient.doctor = new Surgeon();
        } else if (patient.getTreatmentPlan().equalsIgnoreCase("remove tooth")) {
            System.out.println("In that case, I will assign a dentist to you.");
            patient.doctor = new Dentist();
        } else{
            System.out.println("In that case, I will treat you.");
            patient.doctor = new Therapist();
        }
        patient.doctor.treat();
    }
}
