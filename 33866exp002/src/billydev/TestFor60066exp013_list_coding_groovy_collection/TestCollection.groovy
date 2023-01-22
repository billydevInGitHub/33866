package billydev.TestFor60066exp013_list_cding_groovy_collection


class TestCollection {

    static void main(String[] args) {


        int[] intArray= [8,4,5,6]
        println intArray.inject(8,{result,it->result+it})
        println intArray.inject(" ",{result,it->result+it})  //context different result different
        println intArray.inject(" "){result,it->result+it}  //context different result different
        println(intArray)

//
//        String errorFailureResultString = "2 0\n1 0\n2 0\n"
//        println "test error failure result: ${errorFailureResultString}"
//        List<String> resultStringList = new ArrayList<>()
//        if (errorFailureResultString != null&&errorFailureResultString.trim() != "") {
//            resultStringList = errorFailureResultString.split("\\r?\\n")
//                    .flatten()
//                    .findAll { it != null && it.toString().trim() != "" }
//                    .collect { it.toString().trim() }
//        }
//        println "resultStringList: ${resultStringList}"
//
//
//        int runningParallelTestErrorAndFailureNumber =
//                resultStringList.collect{it.split(" ")}
//                        .collect{
//                            return Integer.valueOf(it[0]) + Integer.valueOf(it[1])
//                        }
//                        .sum()
//
//        println "runningParallelTestErrorAndFailureNumber:${runningParallelTestErrorAndFailureNumber}"


        assert ['a', 1, 'a', 'a', 2.5, 2.5f, 2.5d, 'hello', 7g, null, 9 as byte]

        Map<String, String> testMap=new HashMap<>()
        testMap.put("a","aValue")
        testMap.put("b","bValue")
        testMap.put("c","cValue")
        println testMap.each {it.getKey().toString()}
        println testMap.each {it.value=it.getKey().toString()} //each use side effect
        println testMap.collect {it.getKey().toString()}
        println testMap.collect {it.getValue().toString()}


        int[] intArrayTestConvertToMap= [8,4,5,6,80,90,300]
//        println intArrayTestConvertToMap.collectEntries {[it,it+100]}  //array does not support collectEntries
        println intArrayTestConvertToMap.collect().collectEntries {[it,it+100]}
        println intArrayTestConvertToMap.collect()
        println intArrayTestConvertToMap.collect{it}


        int[] intArrayTestCollect= [8,4,5,6,80,90,300]
        intArrayTestCollect.collect({ print it})
        println "testArrayEach ${intArrayTestCollect.each{it=it+5}}"

        ('a'..'z').each{ print it}
        (5..20).each{ println it}

         intArray= [8,4,5,6]
//        intArray.sort()


        println intArray.join("===")
        intArray.eachWithIndex{ int entry, int i -> println entry+"_"+i}


        List<String> tesInjecttList=new ArrayList<>();
        tesInjecttList.add("abc")
        tesInjecttList.add("def")
        println "testListEach ${tesInjecttList.each{it=it+"***"}}"
        println tesInjecttList.join("***")

        println tesInjecttList.inject("aaa"){result,it->result+it}



        [1,2,3].each({ println it})

        List<String> testList=new ArrayList<>();
        testList.add("abc")
        testList.add("def")


        testList.forEach({ println it})
        testList.each({ println it})

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
