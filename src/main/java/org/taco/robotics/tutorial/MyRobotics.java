package org.taco.robotics.tutorial;

public class MyRobotics {

    // static
    private static int intial_position = 0;
    private static int target_position = 100;
    private static final String TACO_TERM = "Hello Tacos";

    private static final String text= "any agencies have begun publishing numerous OMB control numbers as amend-\n" +
            "ments to existing regulations in the CFR. These OMB numbers are placed as \n" +
            "close as possible to the applicable recordkeeping or reporting requirements. \n" +
            "PAST PROVISIONS OF THE CODE \n" +
            "Provisions of the Code that are no longer in force and effect as of the revision \n" +
            "date stated on the cover of each volume are not carried. Code users may find \n" +
            "the text of provisions in effect on any given date in the past by using the appro-\n" +
            "priate List of CFR Sections Affected (LSA). For the convenience of the reader, \n" +
            "a ‘‘List of CFR Sections Affected’’ is published at the end of each CFR volume. \n" +
            "For changes to the Code prior to the LSA listings at the end of the volume, \n" +
            "consult previous annual editions of the LSA. For changes to the Code prior to \n" +
            "2001, consult the List of CFR Sections Affected compilations, published for 1949- \n" +
            "1963, 1964-1972, 1973-1985, and 1986-2000. \n" +
            "‘‘[RESERVED]’’ TERMINOLOGY \n" +
            "The term ‘‘[Reserved]’’ is used as a place holder within the Code of Federal \n" +
            "Regulations. An agency may add regulatory information at a ‘‘[Reserved]’’ loca-\n" +
            "tion at any time. Occasionally ‘‘[Reserved]’’ is used editorially to indicate that \n" +
            "a portion of the CFR was left vacant and not dropped in error. \n" +
            "INCORPORATION BY REFERENCE \n" +
            "What is incorporation by reference? Incorporation by reference was established \n" +
            "by statute and allows Federal agencies to meet the requirement to publish regu-\n" +
            "lations in the Federal Register by referring to materials already published else-\n" +
            "where. For an incorporation to be valid, the Director of the Federal Register \n" +
            "must approve it. The legal effect of incorporation by reference is that the mate-\n" +
            "rial is treated as if it were published in full in the Federal Register (5 U.S.C. \n" +
            "552(a)). This material, like any other properly issued regulation, has the force \n" +
            "of law. \n" +
            "What is a proper incorporation by reference? The Director of the Federal Register \n" +
            "will approve an incorporation by reference only when the requirements of 1 CFR \n" +
            "part 51 are met. Some of the elements on which approval is based are: \n" +
            "(a) The incorporation will substantially reduce the volume of material pub-\n" +
            "lished in the Federal Register. \n" +
            "(b) The matter incorporated is in fact available to the extent necessary to \n" +
            "afford fairness and uniformity in the administrative process. \n" +
            "(c) The incorporating document is drafted and submitted for publication in \n" +
            "accordance with 1 CFR part 51. \n" +
            "What if the material incorporated by reference cannot be found? If you have any \n" +
            "problem locating or obtaining a copy of material listed as an approved incorpora-\n" +
            "tion by reference, please contact the agency that issued the regulation containing \n" +
            "that incorporation. If, after contacting the agency, you find the material is not \n" +
            "available, please notify the Director of the Federal Register, National Archives \n" +
            "and Records Administration, 8601 Adelphi Road, College Park, MD 20740-6001, or \n" +
            "call 202-741-6010. \n" +
            "CFR INDEXES AND TABULAR GUIDES \n" +
            "A subject index to the Code of Federal Regulations is contained in a separate \n" +
            "volume, revised annually as of January 1, entitled CFR INDEX AND FINDING AIDS. \n" +
            "This volume contains the Parallel Table of Authorities and Rules. A list of CFR \n" +
            "titles, chapters, subchapters, and parts and an alphabetical list of agencies pub-\n" +
            "lishing in the CFR are also included in this volume.";
    //instance
    private String team_name = "taco-terminators-17346";


    public static void main(String args[]){
        System.out.println(TACO_TERM);
        // local variable
        int i = 0;

        MyRobotics robotics1 = new MyRobotics();
        System.out.println(robotics1.team_name);


    }


}
