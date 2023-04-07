 import java.util.Scanner;


class Emp{
    
         int id ;
           String name;
         long no ;
           String father;
           
           String mother;
       
           String adress;
            int pin ;
           String pos; 
           
                        public void print(){
                             System.out.println("my id is " +id);
                             System.out.println("my name is "+name);
                             System.out.println("contact number is "+no);
                             System.out.println("fathers name "+father);
                             System.out.println("mothers name "+mother);
                             System.out.println("adresss "+adress);
                             System.out.println("pin code "+pin);
                             System.out.println("position"+pos);
       }
  
               void  input(){
                               Scanner sc =new Scanner(System.in);
        
                           System.out.println("enter my id is " );
                           int ids=sc.nextInt();
                                     System.out.println("enter name is ");
                                     String names=sc.nextLine();
                                     System.out.println("contact number is ");
                                     int num=sc.nextInt();
                                     System.out.println("fathers name ");
                                     String fathesr=sc.nextLine();
                                     System.out.println("mothers name ");
                                     String mothers=sc.nextLine();
                                     System.out.println("adresss ");
                                     String adresss=sc.nextLine();
                                     System.out.println("pin code ");
                                     int pins=sc.nextInt();
                                     System.out.println("position");
                                     String poss=sc.nextLine();
                }
                        
}


public class CustomNewClass {
    public static void main(String[] args) {
        System.out.println("slete 1 for owner 2 for add");
        
        int var=3;
        
        switch (var)
        {
            case 1:
                
                 Emp saanesh = new Emp();
    
    saanesh.id = 8959;
    
    saanesh.name= "saanesh";
    saanesh.no=895977810;
    saanesh.father="ramgopalsonwansi";
    saanesh.mother="mother";
    saanesh.adress="sindhi colony bankhedi";
    saanesh.pin=452001;
    saanesh.pos="owner";
    
    saanesh.print();
    
                
                break;
                
               
                    case 2:
                      Emp get = new Emp();
                       get.input();
                        get.print();
                        
                        break;   
          
                         case 3:
                        
                             System.out.println("Welcome to SVVV Indore\n" +
"1884 is the landmark year as the foundation stone was laid 139 years ago for Shri Vaishnav Group of Institutions by compassionate cloth merchants of Vaishnav cult of Indore, which was later rechristened as Shri Vaishnav Sahayak Kapada Market Committee in the year 1934.\n" +
"\n" +
"Shri Vaishnav Vidyapeeth Trust believes in taking the nation forward by improving the quality of life of its citizens by continuously working in the sphere of education, health and environment. It has been established to promote education and research in various disciplines through academic institutions for the benefits of all sections of the society, but not with the motive of profit.\n" +
"\n" +
"Shri Vaishnav Shekshanik Avam Parmarthik Nyas was established under the able guidance of Shri Vaishnav Sahayak Kapada Market Committee in the year 1981. Since then, Nyas has been working relentlessly for the upliftment of the society and country as a whole by providing better technical and professional education, health facilities, schools and other services. Shri Vaishnav Sahayak Kapada Market Committee is running the following Trusts, Colleges, Schools and Institutes of Professional Studies and Research and also rendering social service.");
                              System.out.println("Welcome to SVVV Indore\n" +
"1884 is the landmark year as the foundation stone was laid 139 years ago for Shri Vaishnav Group of Institutions by compassionate cloth merchants of Vaishnav cult of Indore, which was later rechristened as Shri Vaishnav Sahayak Kapada Market Committee in the year 1934.\n" +
"\n" +
"Shri Vaishnav Vidyapeeth Trust believes in taking the nation forward by improving the quality of life of its citizens by continuously working in the sphere of education, health and environment. It has been established to promote education and research in various disciplines through academic institutions for the benefits of all sections of the society, but not with the motive of profit.\n" +
"\n" +
"Shri Vaishnav Shekshanik Avam Parmarthik Nyas was established under the able guidance of Shri Vaishnav Sahayak Kapada Market Committee in the year 1981. Since then, Nyas has been working relentlessly for the upliftment of the society and country as a whole by providing better technical and professional education, health facilities, schools and other services. Shri Vaishnav Sahayak Kapada Market Committee is running the following Trusts, Colleges, Schools and Institutes of Professional Studies and Research and also rendering social service.");
                               System.out.println("Privacy Policy\n" +
"You may visit our website without revealing any personal information wherever permissible. Certain transactions may require submission of personal information like profile updates and certain databases. We will not sell, swap or rent, or otherwise disclose to any third party any personal information for commercial purpose and such information will be utilized only for the purpose stated. To accomplish such purpose we may disclose the information to our employees, consultants and other concerned having a genuine need to know the information.");
                                System.out.println(" NAV-PRABANDHAN 2023\n" +
"Online Management Conference on \"Responsiveness and Innovation for Sustainable Business: Prospects and Challenges On September 22-23, 2023\n" +
" SHODH - 2023\n" +
"Online Conference for Doctoral Students On EMERGING STRATEGIES IN RESEARCH ; Going Beyond disciplinary Boundaries on March 25, 2023\n" +
" TEXCON 2023\n" +
"6TH NATIONAL CONFERENCE ON 3rd & 4th MARCH, 2023 on \"TEXTILE RECYCLING AND SUSTAINABLE APPAREL DESIGN\"\n" +
" PRAGYATA 2023\n" +
"National Conference on “Sustainable Infrastructure: Challenges and Opportunities (PRAGYATA-2023)” organized on 28-29, April 2023\n" +
"SANMANTRANA-2023\n" +
"A Multi-disciplinary International Congress on “Industry 5.0 and Paradigm Shift: Emerging Challenges” (01st - 03rd February 2023) Organized by Shri Vaishnav Vidyapeeth Vishwavidyalaya, Indore In association with St. Cloud State University, USA\n" +
"SPANDAN 2023\n" +
"A Techno - Cultural Fest at SVVV, February 7-9, 2023\n" +
"TATHYAM- 2023\n" +
"VIRTUAL NATIONAL FORENSIC SCIENCE CONFERENCE ON JANUARY 30-31, 2023\n" +
"FDP from 9th to 20th JANUARY, 2023 at SVVV\n" +
"FDP from 9th to 20th JANUARY, 2023 at SVVV\n" +
"Vinirmah-2023\n" +
"A Fashion Show in offline mode on open platform in SVVV campus on 28th January 2023\n" +
"Confluence 2022 - Alumni Meet\n" +
"Confluence: The re-union 2022, on December 24, 2022");
                                 System.out.println("Governing Body\n" +
"Sr. No.	Name	Designation\n" +
"1.	Shri Purushottamdas Pasari\n" +
"Chancellor	Chairman\n" +
"2.	Dr. Upinder Dhar\n" +
"Vice Chancellor	Member\n" +
"3.	Shri Kamalnarayan Bhuradiya\n" +
"(Nominee of the Sponsoring Body)	Member\n" +
"4.	Shri Girdhar Gopal Nagar\n" +
"(Nominee of the Sponsoring Body)	Member\n" +
"5.	Padma Vibhushan Dr. Anil Kakodkar\n" +
"Former Chairman, Atomic Energy Commission of India\n" +
"(Nominee of the Visitor)	Member\n" +
"6.	Padma Vibhushan Dr. R. A. Mashelkar\n" +
"Former Director General, Council of Scientific and Industrial Research\n" +
"(Nominee of the Visitor)	Member\n" +
"7.	Padma Bhushan Dr. Naresh Trehan\n" +
"Director, Medanta, Medisector 38, Gurgaon, Haryana\n" +
"(Nominee of the Visitor)	Member\n" +
"8.	Dr. A. P. Padhi\n" +
"Former Vice Chancellor, Bhagalpur University, Bihar\n" +
"(Nominee of the Sponsoring Body)	Member\n" +
"9.	Dr. Madhulata Varma\n" +
"OSD, Office of Additional Director, Higher Education, Bhopal\n" +
"(Nominee of the State Government)");
                                  System.out.println("Welcome Message\n" +
"Purushottamdas Pasari\n" +
"Purushottamdas Pasari\n" +
"\n" +
"Chancellor\n" +
"\n" +
"Indian higher education system has expanded at a fast pace by adding nearly 20,000 colleges and more than 80 lakh students in a decade from 2000-01 to 2010-11. Quality of education is a complex issue in itself and can be interpreted in several ways. It is the ability to meet the stated purpose for which the service was offered. The country has seen experimentation in higher education and is struggling to respond to changes in the environment. It is important for an institution and its academic leaders to meet the challenges of changing expectations of its stakeholders in the competitive environment. Shri Vaishnav Vidyapeeth Vishwavidyalaya is committed to offer quality education and shape the skills of the young generation. The emphasis will be laid on the holistic development of the students and a conducive environment will be provided to the researchers. The learners are expected to orient themselves to play a crucial role in preparing themselves not only to face the knowledge based society with confidence but with purpose and responsibility.\n" +
"\n" +
"Wishing you a great learning experience at Shri Vaishnav Vidyapeeth Vishwavidyalaya and a bright future ahead.\n" +
"\n" +
" \n" +
"Chancellor's Profile\n" +
"Born on 24th December, 1948 Purushottamdas Pasari S/o. Late Shri Prahladdasji Pasari, inherited the tradition of social service, religious fervour and work culture from his father who was devoted to educational and social activities.\n" +
"\n" +
"Purushottamdas Pasari attained academic excellence and received the degree of M.Com., L.L.B., and diploma in Business management. He was married to Shrimati Veenadevi and has a son Ajay Pasari and a daughter Shrimati Archana Jaju. The Pasari family inherited the cloth business and has a garment manufacturing industry.\n" +
"\n" +
"Purushottamdas Pasari had to face a lot of adverse and difficult circumstances to manage Shri Vaishnav Trust and educational institutions run by the Trust. Undeterred by inimical situations and circumstances. Pasari stood like a rock and faced all kinds of unfriendly circumstances. He does selfless service and performed all duties and responsibilities given to him by the Trust. He has taken up his responsibilities with a missionary zeal.\n" +
"\n" +
"In addition to his duties to his family, Pasari has attracted the attention of the public with his selfless devotion to social and academic activities.\n" +
"\n" +
"The Pasari family has a major role in establishing Shri Vaishnav Society in Indore. After the sudden demise of his father in 1985, Purushottamdas Pasari became a trustee of Shri Vaishnav group of Trusts. He held the positions of Treasurer, Secretary and various other key responsibilities under the banner of Shri Vaishnav group of Trusts. Taking into account the overall picture of his work, Pasari was elected Chairman of Shri Vaishnav group of Tursts on 25th February 2013. Since then, Shri Vaishnav group of Tursts has made a name in academia and social service. Pasari’s contribution in these fields in laudable.\n" +
"\n" +
"Hon’ble Governor of Madhya Pradesh appointed Purushottamdas Pasari as Chancellor of Shri Vaishnav Vidyapeeth Vishwavidyalaya on 20th July 2015.\n" +
"\n" +
"Considering his service to educational institutions, he was honoured with number of National Awards by various authorities.\n" +
"\n" +
"SERVICES TO EDUCATIONAL INSTITUTIONS AND POSITIONS HELD IN PAST AND BEING HELD AT PRESENT\n" +
"S. No	Name of the Institutions	Year of Establishment	Position held in Past / Being currently held	Period\n" +
"1	Shri Cloth Market Kanya Mahavidyalaya	1983	Founder Secretary	1983 to 2003\n" +
"2	Shri Vaishnav Institute of Management	1987	Founder Secretary Chairman	1987 to 2011\n" +
"2011 to 2017 (July)\n" +
"3	Shri Vaishnav Kanya Vidyalaya	1992	Founder Vice Chairman Working Committee Member	1992 to 2003\n" +
"2003 to date\n" +
"4	Shri Vaishnav Academy	1993	Founder Secretary Working Committee Member	1993 to 2003\n" +
"2003 to date\n" +
"5	Shri Vaishnav Institute of Technology And Science	1995	Founder Secretary Chairman	1995 to 2011\n" +
"2011 to date\n" +
"6	Shri Vaishnav Institute of Law	2005	Working Committee Member	2005 to date\n" +
"7	Working Committee Member	2005	Founder Secretary Chairman	2005 to date\n" +
"8	Shri Vaishnav Vidyapeeth Vishwavidyalaya	2015	Chancellor	2015 to date\n" +
"9	Shri C. M. Vaishnav Higher Secondary School	1951	Working Committee Member Secretary Chairman	1985 to 1989\n" +
"1989 to 2007\n" +
"2007 to 2009\n" +
"10	Shri Vaishnav Polytechnic	1962	Working Committee Member Chairman Managing Committee	1985 to 2013\n" +
"2013 to date\n" +
"11	Shri Vaishnav Commerce College	1967	Secretary	1985 to 2011\n" +
"12	Shri C. M. Vaishnav Bal Mandir Higher Secondary School	1981	Working Committee Member	1985 to date\n" +
"13	Shri Vaishnav Mahavidyalayeen Girls Hostel	2001	Working Committee Member	2001 to date\n" +
"14	Shri Vaishnav Mahavidyalayeen Boys Hostel	2002	Working Committee Member	2002 to date\n" +
"15	Shri Ayurvedic Brahmachary Sanskrat School	2011	Secretary	2011 to date\n" +
"16	Shri Maheshwari Vidyalaya	1921	Working Committee Member	1985 to 2003\n" +
"17	Shri Maheshwari Commerce College	1994	Working Committee Member	1994 to 2014\n" +
"18	Shri B. D. Toshniwal Maheshwari Vidyalaya	1997	Working Committee Member	1997 to 2011\n" +
"19	Smt. Phoolbai Murlidhar Jhanwar Maheshwari Kanya Chhatrawaas	1997	Working Committee Member	1997 to 2014\n" +
"20	Shri Maheshwari Chhatrawaas	2016	Working Committee Member	2016 to date\n" +
"21	Shri Venkateshwar Technology & Management	2006	Founder Chairman	2006 to date\n" +
"22	Shri Vidya Niketan, Chandrawatiganj	2011	Founder Chairman	2011 to date\n" +
"23	Shri Techno Skill Academy	2015	Founder Chairman	2015 to date\n" +
"\n" +
"SERVICES TO PUBLIC TRUST AND POSITION HELD AND BEING HELD\n" +
"S. No	Name of the Institutions	Year of Establishment	Position held & Being held	Period\n" +
"1	Shri Tikamdas Pasari Dharmik Avam Parmarthik Trust	1959	Managing Trustee	1986 to date\n" +
"2	Shri Prahladdas Pasari Smriti Chairity Trust	1986	Founder Secretary Chairman	1986 to date\n" +
"3	Shri Vaishnav Sahayak Kapada Market Committee	1984	Member\n" +
"Chairman	1984 to date\n" +
"4	Shri Vaishnav Sahayak Trust	1939	Treasurer\n" +
"Secretary\n" +
"Chairman	1985 to 2012\n" +
"2012 to 2013\n" +
"2013 to date\n" +
"5	Shri Vaishnav Chairity Trust	1971	Secretary\n" +
"Chairman	1991 to 2012\n" +
"2013 to date\n" +
"6	Shri Vaishnav Saikshanik Avam Parmarthik Nyas	1981	Treasurer\n" +
"Secretary\n" +
"Chairman	1985 to 2012\n" +
"2012 to 2013\n" +
"2013 to date\n" +
"7	Shri Vaishnav Vidyapeeth Trust	2002	Founder Secretary\n" +
"Chairman	2002 to 2012\n" +
"2013 to date\n" +
"8	Shri Maheshwari Sarvajanik Seva Trust	1972	Trustee Chairman	1986 to 2015\n" +
"2015 to 2017\n" +
"9	Shri Maheshwari Vidyalaya Trust	1943	Treasurer\n" +
"Vice-Chairman	1986 to 2011\n" +
"2011 to 2016\n" +
"10	Shri Gyarah Panch Dharmik Parmarthik Trust	1940	Trustee\n" +
"Secretary	1986 to 1994\n" +
"1994 to date\n" +
"11	Shri Ashtang Ayurvedic Bhahmcharya Ashram Trust	1951	Trustee\n" +
"Secretary	1986 to 2011\n" +
"2011 to date\n" +
"12	Shri Ahilyamata Goshala Jivdaya Mandal Trust	1948	Trustee\n" +
"Secretary	2006 to 2008\n" +
"2008 to date\n" +
"13	Shri Maheshwari Sadhe Saat Sou Panchayati Trust	1951	Trustee	1986 to date\n" +
"14	Shri Maharaja Tukojirao Cloth Market Merchant Association Bhawan	1960	Trustee	1986 to date\n" +
"\n" +
"RELIGIOUS SERVICES AND POSITIONS HELD AND BEING HELD\n" +
"S. No	Name of the Institutes	Year of Establishment	Position held & Being held	Period\n" +
"1	Shri Laksminarayan Mandir Trust Committee, Chandrawatiganj	1951	Managing Trustee	1985 to date\n" +
"2	Shri Balmukund Jhalariya Gyan Prasar Ashram Nyas	1970	Vice Chairman	1986 to date\n" +
"3	Shri Tirupati Balaji Venkatesh Devsthan	1997	Vice Chairman	1997 to date\n" +
"\n" +
"HELTH SERVICES AND POSITIONS HELD AND BEING HELD\n" +
"S. No	Name of the Institutes	Year of Establishment	Position held & Being held	Period\n" +
"1	Shri Vaishnav Ayurvedic Hospital	1934	Working committee member Chairman	1985 to 2012\n" +
"2012 to date\n" +
"2	Shri Cloth Market Hospital	1974	Working committee member	1974 to date\n" +
"3	Shri S.K.Mukhargee Cardiology & Research Centre	1984	Working committee member Chairman	1984 to 2013\n" +
"2013 to date\n" +
"4	Shri Vaishnav Diagnostic & Kidney Centre	2016	Chairman	2016 to date\n" +
"5	Shri Indore Cancer Charitable Foundation Trust	1989	Trustee	2017 to date\n" +
"\n" +
"NATIONAL LEVEL AWARDS FOR CONTRIBUTION TOWORDS EDUCTIONAL SERVICES\n" +
"S. No	Name of Award	Authority by whom the award is given	Date of award\n" +
"1	Indian Leadership Award for Educational Excellence	All Indian Achievers Foundation, New Delhi	12th November 2013\n" +
"2	Indira Gandhi Excellence Award	International Business Council, New Delhi	21st December 2013\n" +
"3	Rajeev Gandhi Achievers Award for Educational Excellence	International Business Council, New Delhi	23rd December 2014\n" +
"\n" +
"STATE LEVEL AWARDS FOR CONTRIBUTION TOWORDS EDUCATIONAL SERVICES\n" +
"S. No	Name of Award	Authority by whom the award is given	Date of award\n" +
"1	Saraswati Award	Sr. S.K. Rai Union Minister for Textile Shri Textile Association M.P	30th August 2013\n" +
"2	Paropkar Ratna	Patanjali Yog Vidyapeeth , Indore	16th March 2014\n" +
"3	Technical Education Award	Association of Professional Institute of Madhya Pradesh, Bhopal	2014");
                             
          break;
   
    
    
        }
    }
}
