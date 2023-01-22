package billydev.groovy_33866exp002_b_replaceSubStringInLongString

class ReplaceSubStringWithLongString {
    static void main(String[] args) {
        String sourceString= "mock_oracle_home/sqlplus -silent system/oracle@//TEMPLATE:1521/local <<EOF\nSET PAGESIZE 0\nset heading off\nselect 'ALIVE' from dual\nEXIT;\nEOF\n"
        println sourceString.replace("TEMPLATE","server1")

    }
}
