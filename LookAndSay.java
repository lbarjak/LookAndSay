public void lookAndSay() {
    String num = "1";
    int counter = 1;
    for (int j = 0; j < 10; j++) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < num.length(); i++) {
            if (i < num.length() - 1 && num.charAt(i) == (num.charAt(i + 1))) {
                counter++;
            } else {
                result.append(counter);
                result.append(num.charAt(i));
                counter = 1;
            }
        }
        num = result.toString();
        System.out.println(num);
    }
}
