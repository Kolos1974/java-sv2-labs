package dynamictypes.publictransport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PublicTransportTest {

    @Test
    void textVehicles(){
        PublicVehicle bus = new Bus(133, 18, "Ikarus");
        PublicVehicle tram = new Tram(19, 22, 1);
        PublicVehicle metro = new Metro(2, 33, 18);

        PublicTransport publicTransport = new PublicTransport();
        publicTransport.addVehicle(bus);
        publicTransport.addVehicle(tram);
        publicTransport.addVehicle(metro);

        assertEquals(3, publicTransport.getPublicVehicles().size());


    }
}