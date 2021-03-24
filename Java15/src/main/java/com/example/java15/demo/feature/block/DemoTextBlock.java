package com.example.java15.demo.feature.block;

public class DemoTextBlock {

    public String getBlockOfHtml() {
        return """
                <html>

                    <body>
                        <span>example text</span>
                    </body>
                </html>""";
    }

    public String getTextWithCarriageReturns() {
        return """
                separated with\r
                carriage returns""";
    }

    public static void main(String[] args) {
        DemoTextBlock blck = new DemoTextBlock();
        System.out.println(blck.getBlockOfHtml());
        System.out.println(blck.getTextWithCarriageReturns());
    }
}
