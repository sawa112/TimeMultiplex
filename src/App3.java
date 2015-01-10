import station.Station;

public class App3 {
	private static String INTERFACE_NAME_DEFAULT = "eth0";
	private static String MCASTADDRESS_DEFAULT = "225.10.1.2";
	private static int RECEIVE_PORT_DEFAULT = 16000;
	private static String STATION_CLASS_DEFAULT = "A";

	public static void main(String[] args) {
		Station s1 = new Station(INTERFACE_NAME_DEFAULT, MCASTADDRESS_DEFAULT, RECEIVE_PORT_DEFAULT, STATION_CLASS_DEFAULT);
		s1.start();
	}
}
