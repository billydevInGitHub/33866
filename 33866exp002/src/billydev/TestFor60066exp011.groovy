package billydev

import java.time.Duration
import java.time.LocalDateTime
import java.time.temporal.ChronoUnit
import java.util.concurrent.ConcurrentHashMap

class TestFor60066exp011 {

    static void main(String[] args) {


        List list=new ArrayList()
        list.add("abc")
        list.collect()

        List list2=null
        switch(list.get(0)){
            case "a": println("adsf")
            case "b": println("adsf")
            default: println("asfs")
        }

        List<String> testStreamNull=new ArrayList<>()
        testStreamNull.stream().each{
            String serverName = it
            println serverName
        }


        List<String> serverNames=new ArrayList<>()
        serverNames.add("aadsf")
        serverNames.each {
            String serverName = it
            println serverName
        }

        boolean a =null||false

        println a

        String value=""
        value.replaceAll("_", "\\\\\\\\_")

//        Map test=new HashMap();
        Map test=null;

        test.entrySet().stream().each( {println(it)} )


        LocalDateTime previousMessageTime = LocalDateTime.now().minusHours(3)
        LocalDateTime now = LocalDateTime.now()
        Duration duration = Duration.between(previousMessageTime, now);
        boolean isMessageSentNeeded = duration > Duration.ofHours(24)||(now.plusMinutes(30).truncatedTo(ChronoUnit.HOURS).getHour() == 8 && now.truncatedTo(ChronoUnit.HOURS).getHour() == 8);
        println(isMessageSentNeeded)


        Object

        LinkedHashMap

        ConcurrentHashMap

        Integer


        Thread

        Collection c= new ArrayList();
        c.add("adbc")


//        String jobName="abc-def"
        String jobName="-"
//        String jobName=""
        String jobSuffix
        try {
            jobSuffix = jobName.split('-').last()    //use this one will throw exception when jobName="="
//            jobSuffix=jobName.split('-').length==0?"": jobName.split('-').last()

//            [].last();
            println(jobName)
        } catch (NoSuchElementException ignored) {
            println("exception thrown")
//            jobSuffix = jobName
//            println(jobName)
        }

        println("jobSuffix:|"+jobSuffix+"|")
    }
}
