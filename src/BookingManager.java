package coachmanagementcode;

/**
 * Created by shiyam on 2/2/16.
 */
public class BookingManager {

    private Individual individual;
    private String uniqueCode;
    private String startDate;
    private Route aRoute;
    private BusDriver aDriver;

    public void book(){

    }

    public Individual getIndividual() {
        return individual;
    }

    public void setIndividual(Individual individual) {
        this.individual = individual;
    }

    public String getUniqueCode() {
        return uniqueCode;
    }

    public void setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public Route getaRoute() {
        return aRoute;
    }

    public void setaRoute(Route aRoute) {
        this.aRoute = aRoute;
    }

    public BusDriver getaDriver() {
        return aDriver;
    }

    public void setaDriver(BusDriver aDriver) {
        this.aDriver = aDriver;
    }

}
