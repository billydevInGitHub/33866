package billydev.groovy_33866exp002_a_regex

class TestRegex {

    static void main(String[] args) {
        //borrow from TestFailuresAboveThresholdProcessorParallelInt.groovy isJobPatternMatch()
        String jobPrefix="parallel-integration"
        String jobSuffix="develop"
        //so this regex pattern does not want to match parallel integration 19c but real parallel integration
        println "parallel-integration-19c-develop" ==~  /${jobPrefix}-(?!19c).*${jobSuffix}/
        println "parallel-integration-19c-develop" ==~  /${jobPrefix}-(?!19c).*${jobSuffix}/
        println "parallel-integration-develop" ==~  /${jobPrefix}-(?!19c).*${jobSuffix}/
    }
}
