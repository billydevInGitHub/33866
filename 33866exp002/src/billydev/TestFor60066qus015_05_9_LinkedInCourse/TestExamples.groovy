package billydev.TestFor60066qus015_05_9_LinkedInCourse

class TestExamples {

    static void main(String[] args) {

        Person person = new Person()
        person.setFirstName("John")
        person.setLastName("Doe")
        person.firstName="JohnChanged"

        println person.getFullName()

        person= new Person(lastName:"lll", firstName:'fff')
        println person.getFullName()

        //test closure
        Closure closure={println person.getFullName()+" within closure"}
        closure()
        closure.call()
        testClosure (closure)


        Closure pClosure= {Person p->  println p.getFullName()+" parameterized closure"}
        pClosure(person)

        testParameterizedClosurePassedInAsMethodParameter(pClosure, person)

    }

    static void testClosure(Closure closure){
        println "within testClosure method"
        closure()
    }

    static void testParameterizedClosurePassedInAsMethodParameter(Closure closure, Person person){
        println "within testClosure method"
        closure(person)
    }

}

