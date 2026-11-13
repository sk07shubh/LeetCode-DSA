class Solution {
    public int numUniqueEmails(String[] emails){
        Set<String> st=new HashSet<>();

        for(String email:emails){
            String[] parts=email.split("@");
            String local=parts[0].replace(".","");

            if(local.contains("+")){
                local=local.substring(0,local.indexOf("+"));
            }

            st.add(local+"@"+parts[1]);
        }

        return st.size();
    }
}