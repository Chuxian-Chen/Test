//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.




void main() throws UnknownHostException {

    InetAddress address = InetAddress.getByName("192.168.0.1");
    System.out.println(address.getHostName());

}
