package nestedclasses.dns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NameServer {
    private List<DnsEntry> dns = new ArrayList<>();

    public List<DnsEntry> getDns() {
        return dns;
    }

    private static class DnsEntry{
        private String name;
        private String ip;

        public DnsEntry(String name, String ip) {
            this.name = name;
            this.ip = ip;
        }

        public String getName() {
            return name;
        }

        public String getIp() {
            return ip;
        }
    }

    public void addEntry(String hostName, String hostIp) {
        if ((!(findByName(hostName)==null)) || (!(findByIp(hostIp)==null))){
            throw new IllegalArgumentException("Already exists");
        }

        dns.add(new DnsEntry(hostName, hostIp));
    }

    private DnsEntry findByName(String name){
        for (DnsEntry element : dns){
            if (element.getName().equals(name)){
                return element;
            }
        }
        return null;
    }

    private DnsEntry findByIp(String ip){
        for (DnsEntry element : dns){
            if (element.getIp().equals(ip)){
                return element;
            }
        }
        return null;
    }

    public String getIpByName(String name){
        DnsEntry element = findByName(name);
        if (!(element==null)){
            return element.getIp();
        }
        throw new IllegalArgumentException("Element not found");
    }

    public String getNameByIp(String ip){
        DnsEntry element = findByIp(ip);
        if (!(element==null)){
            return element.getName();
        }
        throw new IllegalArgumentException("Element not found");
    }

    public void removeEntryByIp(String ip){
        DnsEntry element = findByIp(ip);
        if (!(element==null)){
            dns.remove(element);
        }
    }

    public void removeEntryByName(String name){
        DnsEntry element = findByName(name);
        if (!(element==null)){
            dns.remove(element);
        }
    }


    public static void main(String[] args) {
        NameServer nameServer = new NameServer();
        nameServer.addEntry("index.hu","101.101.101.101");
        System.out.println(nameServer.getDns().get(0).getName()+" "+nameServer.getDns().get(0).getIp());
    }
}
