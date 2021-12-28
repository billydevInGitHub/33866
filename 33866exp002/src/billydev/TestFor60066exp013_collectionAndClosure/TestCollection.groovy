package billydev.TestFor60066exp013_collectionAndClosure

class TestCollection {

    static void main(String[] args) {



        List<String> testList=new ArrayList<>();
        testList.add("abc")
        testList.add("def")

        println(testList.collectEntries{[(it):it.toUpperCase()]})


        //
        def strTestBoolean = ''
        if(strTestBoolean){ println "ok"
        }else{
            println "not ok"
        }



        //safe navigation operator
        String str=null
        println "str.reverse:"+ str.reverse()




        List<String> stringList=new ArrayList<>()
//        stringList.stream().


    }
}
