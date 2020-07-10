package manu.pruebas;

import manu.pruebas.elastic.Elastic22;

import java.util.Arrays;

public class Help {

    public Help() {
        Help.run();
    }

    public static void main(final String[] args) {
        final Help kk22 = new Help();
        Help.run();
    }

    public class Pojo22 {
        public String kk22;

        public Pojo22() {
        }
    }


    public static void f22(final int kk) {
        String aux = "";
        String number = aux + kk;
        final char[] chars = new char[16 - number.length()];
        Arrays.fill(chars, '0');
        aux = new String(chars);
        number = aux + kk;
        System.out.println(number);
    }

    public static void f23() {
        final String aaa = "3423-afefe";
        final int kk23 = aaa.indexOf("-");

        System.out.println();
        System.out.println(kk23);
        System.out.println(aaa.substring(0, kk23 - 1));
        System.out.println(aaa.substring(kk23 + 1));

    }

    public static void run() {
        System.out.println(" ------------------ ");

        final Elastic22 kk22 = new Elastic22();
        kk22.run();


//        int kk22 = 432;
//        f22(kk22);


//        f23();
//        int kk22 = 3;
//        int kk23 = kk22/2;
//
//        System.out.println( kk22 + " - " + kk23 );


//
//        Charset utf8 = StandardCharsets.UTF_8;
//        List<String> lines = Arrays.asList("1st line", "2nd line");
//        byte[] data = {1, 2, 3, 4, 5};
//
//        try {
//            Files.write(Paths.get("file1.bin"), data);
//            Files.write(Paths.get("file2.bin"), data,
//                    StandardOpenOption.CREATE, StandardOpenOption.APPEND);
//            Files.write(Paths.get("file3.txt"), "content".getBytes());
//            Files.write(Paths.get("file4.txt"), "content".getBytes(utf8));
//            Files.write(Paths.get("file5.txt"), lines, utf8);
//            Files.write(Paths.get("file6.txt"), lines, utf8,
//                    StandardOpenOption.CREATE, StandardOpenOption.APPEND);
//            Files.write(Paths.get("file7.txt"), lines, utf8,
//                    StandardOpenOption.CREATE, StandardOpenOption.APPEND);
//            Files.write(Paths.get("file7.txt"), lines, utf8);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//

//
//        final Date time = new Date();
//
//        final String timeStr = time.getYear() + "-" + time.getMonth() + 1 + "-" + time.getDay() + " " +
//                time.getHours() + ":" + time.getMinutes() + ":" + time.getSeconds();
//        final String timeStr2 = "2020-4-4 9:4:18";
//
//
//        // Filter set to a year ago until the current month
//        final Date endDate = Calendar.getInstance().getTime();
//        final Calendar cal = Calendar.getInstance();
////        Date startDate = DateUtil.addInterval(endDate, -11, Calendar.MONTH);
////        startDate = DateUtil.getMonthStart(startDate);
//
//        final Calendar cal = Calendar.getInstance();
//        final String kk22 = cal.get(Calendar.YEAR) + "-" + cal.get(Calendar.MONTH) + 1 +
//                "-" + cal.get(Calendar.DAY_OF_MONTH) + "-" + cal.get(Calendar.HOUR) +
//                "-" + cal.get(Calendar.MINUTE) + "-" + cal.get(Calendar.SECOND)
//                + "-" + cal.get(Calendar.MILLISECOND);
//
//        System.out.println(kk22);
//


//        java.util.UUID.randomUUID();
//
//
//        System.out.println(java.util.UUID.randomUUID());
//
//        System.out.println(Math.floor(Math.random() * 6 + 1));
////
//
//        for (int i = 0; i < 20; i++) {
//
//            System.out.println(" - " + Integer.toHexString(i) + " - " +
//                    String.format("%x", new BigInteger(1, ((new Integer(i)).toString()).getBytes())) + " - " +
//                    String.format("%x", new BigInteger(1, Integer.toHexString(i).getBytes())) + " - " +
//                    String.format("%032X", i) + " - " +
//                    "");
//
//        }
//
//
//        for (int i = 0; i < 20; i++) {
//            System.out.println(String.format("%032X", i));
//        }
//                    - 10 - 3136 - 3130 - 00010 -
//                    - 11 - 3137 - 3131 - 00011 -
//                    - 12 - 3138 - 3132 - 00012 -


//Integer.toHexString(num);
//            String.format("%040x", new BigInteger(1, (i + "").getBytes()));

//            String.format("%040x", new BigInteger(1, (i + "").getBytes()));

/*


https://easa-eu-bilbomatica.atlassian.net/wiki/spaces/ECCAIRS/pages/491913225/01+JSON+structure#Multiple-Entities

Multiple Entities

    Multiple instances of the same Entity are repeated in the JSON, with a sequence number.

        Some examples are Aircraft, Engine, …

SEQUENCE NUMBER

Additional numbering included in 'Event Type' - attribute 390. The sequence number specified the order in which the events took place.


"Entity_tax_code":
    {
	"ID":"IDBE24A3B93128468C9FCB2EB05DDC8640",
    "SequenceNumber": "number1"
	"ATTRIBUTES":
		{
   		"Attribute_tax_code": "aaa"
   		}
    },
    {
	"ID":"IDBE24A3B93128468C9FCB2EB05DDC8654",
    "SequenceNumber": "number2"
	"ATTRIBUTES":
		{
   		"Attribute_tax_code": "aaa"
   		}
    },
    {
	"ID":"IDBE24A3B93128468C9FCB2EB05DDC8789",
    "SequenceNumber": "number3"
	"ATTRIBUTES":
		{
   		"Attribute_tax_code": "aaa"
   		}
    },




...
"14":
    {
	"ID":"IDBE24A3B93128468C9FCB2EB05DDC8640",
    "SequenceNumber": "00001"
	"ATTRIBUTES":
		{

1593085741041


        System.out.println(" - ");


        final String kk23 = "12345";


        System.out.println(" - " + kk23.substring(0, kk23.length() - 1));

 */

        System.out.println(System.currentTimeMillis());
        System.out.println(" ------------------ ");


    }

}
