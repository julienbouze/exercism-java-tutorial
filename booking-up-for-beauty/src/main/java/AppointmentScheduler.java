import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription,parser);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime now = LocalDateTime.now();
        return appointmentDate.isBefore(now);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return appointmentDate.getHour()>=12 && appointmentDate.getHour()<18;
    }

    public static String getDescription(LocalDateTime appointmentDate) {
        Locale locale = Locale.ENGLISH;
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a", locale);
        try {
            String time = appointmentDate.format(parser);
            return "You have an appointment on " + time + ".";
        } catch (DateTimeParseException e) {
            return "Invalid date: " + e.getMessage();
        }
    }
    

    public LocalDate getAnniversaryDate() {
        int now = LocalDateTime.now().getYear();
        return LocalDate.of(now,9,15);
    }
}
