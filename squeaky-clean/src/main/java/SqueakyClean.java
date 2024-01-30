class SqueakyClean {
    static String clean(String identifier) {
        // replace spaces with underscores, control characters with CTRL, remove numbers, emojis and lowercase Greek letters
        identifier = identifier.replaceAll(" ", "_").replaceAll("[\\x00-\\x1F\\x7F]", "CTRL")
                               .replaceAll("[0-9]|[\\x{0001f300}-\\x{0001f64f}]|[\\u03B1-\\u03C9]", "");
        if(identifier.isEmpty()){
            return "";
        }
        StringBuilder identifierSB = new StringBuilder();
        identifierSB.append(identifier);
        for(int idx = 0; idx < identifierSB.length(); idx++){
            if(identifierSB.charAt(idx) == '-'){
                identifierSB.deleteCharAt(idx).setCharAt(idx,
                Character.toUpperCase(identifierSB.charAt(idx)));
            }
        }
        return identifierSB.toString();
    }
}