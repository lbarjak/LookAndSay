public void lookAtSay() {
    String num = "1";
    Integer counter = 1;
    for (int j = 0; j < 12; j++) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < num.length(); i++) {
            if (!num.substring(i + 1).isEmpty() && num.charAt(i) == (num.charAt(i + 1))) {
                counter++;
            } else {
                result.append(counter.toString());
                result.append(num.charAt(i));
                counter = 1;
            }
        }
        System.out.println(result);
        num = result.toString();
    }
}