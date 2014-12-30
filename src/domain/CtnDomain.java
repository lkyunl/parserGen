package domain;

import java.util.Map;
import java.util.Random;


public class CtnDomain implements Domain {

	private Random random = new Random();
	@Override
	public String makeValue(Map<String, String> map) {
		
		return CTN[random.nextInt(CTN.length)];
	}
	
	private static String[] CTN = {
		"01020931948",
		"01072388422",
		"01020550111",
		"01010424523",
		"01022024591",
		"01009746473",
		"01057836583",
		"01091659531",
		"01013639457",
		"01061917748",
		"01030560323",
		"01033982095",
		"01005990132",
		"01058848146",
		"01044437384",
		"01029310275",
		"01057618002",
		"01091002468",
		"01077363154",
		"01050773830",
		"01054885387",
		"01084167429",
		"01097469606",
		"01025805821",
		"01006753054",
		"01033498217",
		"01055640038",
		"01025606912",
		"01097504414",
		"01055740719",
		"01066473918",
		"01008725643",
		"01007737205",
		"01059113171",
		"01039235917",
		"01005487238",
		"01080742202",
		"01012202862",
		"01082953117",
		"01097691085",
		"01006623902",
		"01041355303",
		"01047119323",
		"01090834205",
		"01080738486",
		"01020909957",
		"01008827012",
		"01057686654",
		"01013251356",
		"01031000043",
		"01034856536",
		"01048454477",
		"01009749299",
		"01004193202",
		"01052237421",
		"01036931301",
		"01096664969",
		"01094465249",
		"01024896095",
		"01052786922",
		"01074958165",
		"01088063883",
		"01008142385",
		"01008956191",
		"01046698694",
		"01035207167",
		"01011423823",
		"01077248383",
		"01054744131",
		"01041643787",
		"01048187325",
		"01067135485",
		"01023640463",
		"01076573687",
		"01079773349",
		"01002268696",
		"01082564069",
		"01040451665",
		"01090311244",
		"01022650978",
		"01093483693",
		"01090375163",
		"01042200091",
		"01001693640",
		"01074790037",
		"01058837050",
		"01041972720",
		"01038547019",
		"01019187949",
		"01067597100",
		"01053451963",
		"01019120340",
		"01081672410",
		"01056737811",
		"01066326506",
		"01030942860",
		"01003654692",
		"01044247262",
		"01042310876",
		"01079548858",
		"01015792089",
		"01011448357",
		"01019821429",
		"01053889487",
		"01074954920",
		"01093755647",
		"01024009755",
		"01023491899",
		"01020786607",
		"01048301678",
		"01072740826",
		"01050588653",
		"01090471272",
		"01016187559",
		"01013093477",
		"01017854953",
		"01039807875",
		"01028402370",
		"01062212215",
		"01014881969",
		"01020839484",
		"01019309876",
		"01056875166",
		"01095221346",
		"01087842531",
		"01005027192",
		"01029958394",
		"01076483584",
		"01015292199",
		"01046556982",
		"01075397607",
		"01089442698",
		"01093086522",
		"01078817066",
		"01042208316",
		"01005839536",
		"01046012576",
		"01054195748",
		"01077318941",
		"01060581026",
		"01010727066",
		"01094974504",
		"01054901117",
		"01063217668",
		"01084456233",
		"01003033013",
		"01088766516",
		"01083663870",
		"01000708289",
		"01089158947",
		"01077495737",
		"01079357295",
		"01060521868",
		"01041676581",
		"01092745084",
		"01091983169",
		"01013783127",
		"01037720430",
		"01050161891",
		"01046521303",
		"01015672861",
		"01067305841",
		"01002597342",
		"01003998627",
		"01043363886",
		"01033344832",
		"01063769897",
		"01057802709",
		"01057472764",
		"01089931414",
		"01038820638",
		"01067662382",
		"01022955906",
		"01097402864",
		"01090212660",
		"01018506995",
		"01021080145",
		"01019189461",
		"01059375896",
		"01074160380",
		"01090410809",
		"01005762359",
		"01088263014",
		"01032791020",
		"01030592912",
		"01028502258",
		"01039543556",
		"01019268987",
		"01082337058",
		"01077768049",
		"01012058395",
		"01012577774",
		"01080947125",
		"01042397040",
		"01097439923",
		"01025634216",
		"01005444663",
		"01034232539",
		"01035350762",
		"01014637786",
		"01023446662",
		"01036520662",
		"01027987665",
		"01014145879",
		"01051572188",
		"01013375702",
		"01065644004",
		"01002038914",
		"01053096406",
		"01006421996",
		"01094379555",
		"01030043240",
		"01073733919",
		"01002781474",
		"01091902698",
		"01035498941",
		"01092748286",
		"01033647304",
		"01010464531",
		"01049967096",
		"01034304804",
		"01092299895",
		"01048581256",
		"01031394018",
		"01040093719",
		"01025510266",
		"01012357917",
		"01095251592",
		"01010593056",
		"01080515028",
		"01025963140",
		"01023265459",
		"01073886791",
		"01005850715",
		"01096323966",
		"01098142561",
		"01091820792",
		"01041596841",
		"01016862174",
		"01057481834",
		"01068161479",
		"01048417704",
		"01007411208",
		"01092822095",
		"01020760880",
		"01054369671",
		"01024875693",
		"01075126110",
		"01013475086",
		"01048420493",
		"01052844842",
		"01056413643",
		"01063309801",
		"01031450266",
		"01066285643",
		"01077716807",
		"01037179270",
		"01058021681",
		"01092416571",
		"01059180182",
		"01086223607",
		"01066146382",
		"01010155425",
		"01092311694",
		"01024042931",
		"01032174988",
		"01087291775",
		"01052527766",
		"01089715393",
		"01075321485",
		"01058516481",
		"01070288539",
		"01045170182",
		"01092274702",
		"01074655283",
		"01047295359",
		"01073541986",
		"01065488997",
		"01037126744",
		"01045352048",
		"01078173077",
		"01075163177",
		"01045222633",
		"01004329302",
		"01029792974",
		"01087766768",
		"01015171629",
		"01038278502",
		"01013900498",
		"01077085747",
		"01022666865",
		"01021622484",
		"01017763014",
		"01008209486",
		"01074884069",
		"01004409765",
		"01068672921",
		"01030233764",
		"01005847059",
		"01021746338",
		"01021201680",
		"01011837664",
		"01033501181",
		"01045835368",
		"01023541359",
		"01078035798",
		"01030680529",
		"01059518621",
		"01006130881",
		"01099360903",
		"01008187467",
		"01087104573",
		"01032656325",
		"01017357507",
		"01032396306",
		"01023614069",
		"01020165609",
		"01051760194",
		"01035345730",
		"01052714035",
		"01035848266",
		"01072853709",
		"01074121474",
		"01032287891",
		"01030631596",
		"01037540140",
		"01054669417",
		"01064323775",
		"01084213610",
		"01087616241",
		"01051037279",
		"01082638987",
		"01056137145",
		"01061834351",
		"01045087668",
		"01050275606",
		"01061687557",
		"01095401342",
		"01025002061",
		"01050069273",
		"01071932537",
		"01036192203",
		"01094627448",
		"01044296655",
		"01067185054",
		"01014858713",
		"01065230945",
		"01051024513",
		"01014662683",
		"01022978968",
		"01082988190",
		"01012915373",
		"01062552987",
		"01027223712",
		"01029861349",
		"01058475986",
		"01021361100",
		"01035312394",
		"01092527837",
		"01014237915",
		"01084380035",
		"01093648363",
		"01043174161",
		"01005630245",
		"01007363068",
		"01069212526",
		"01041349377",
		"01020975407",
		"01062200127",
		"01050512013",
		"01002316115",
		"01075645917",
		"01004874399",
		"01025386092",
		"01044781351",
		"01008821353",
		"01079448925",
		"01087636562",
		"01019107464",
		"01060166631",
		"01041746281",
		"01022658884",
		"01075208957",
		"01089578099",
		"01034990664",
		"01010335808",
		"01072003392",
		"01056253177",
		"01015803921",
		"01043409171",
		"01035428358",
		"01027022240",
		"01022164113",
		"01070734296",
		"01001750269",
		"01097661140",
		"01072941454",
		"01090010125",
		"01058577620",
		"01006694382",
		"01001910057",
		"01015851603",
		"01063470451",
		"01031381378",
		"01071541084",
		"01040063426",
		"01012687436",
		"01014089286",
		"01010790307",
		"01097993446",
		"01082396617",
		"01058972570",
		"01021238968",
		"01000793179",
		"01007084517",
		"01004075448",
		"01037444982",
		"01006009344",
		"01056599511",
		"01073878906",
		"01013849055",
		"01062962907",
		"01061859048",
		"01064618178",
		"01008470841",
		"01083182985",
		"01014379366",
		"01062734985",
		"01028007251",
		"01093059680",
		"01083022001",
		"01043841672",
		"01027589093",
		"01038523427",
		"01098252658",
		"01014631036",
		"01066454037",
		"01046218849",
		"01064043500",
		"01059442970",
		"01037432086",
		"01004134762",
		"01029376618",
		"01021500047",
		"01054395115",
		"01039316463",
		"01052284888",
		"01087877042",
		"01056770634",
		"01006275893",
		"01069504110",
		"01044047817",
		"01050113179",
		"01063638006",
		"01018865543",
		"01057925621",
		"01026907935",
		"01041942228",
		"01000781200",
		"01028364603",
		"01033903150",
		"01056829050",
		"01057773595",
		"01006564655",
		"01039901593",
		"01081274705",
		"01056919827",
		"01082846271",
		"01054838236",
		"01051301642",
		"01042167193",
		"01022393689",
		"01056704689",
		"01023545007",
		"01052594106",
		"01054785511",
		"01036471829",
		"01080505179",
		"01097949588",
		"01023730918",
		"01091429426",
		"01023280842",
		"01087716699",
		"01091146153",
		"01032363767",
		"01065263591",
		"01028593645",
		"01068324072",
		"01044413325",
		"01004526271",
		"01002335964",
		"01004591107",
		"01045417329",
		"01061318296",
		"01017410329",
		"01010025063",
		"01066590770",
		"01044660798",
		"01048396297",
		"01070767305",
		"01057253036",
		"01034468983",
		"01018173712",
		"01031282576",
		"01066231770",
		"01051577102",
		"01016612833",
		"01095772402",
		"01057634195",
		"01015787632",
		"01022792780",
		"01075722158",
		"01056947620",
		"01048437356",
		"01004162315",
		"01051112287",
		"01080136758",
		"01079224710",
		"01034567224",
		"01015698017",
		"01004783799",
		"01011627607",
		"01074032554",
		"01087948665",
		"01047110260",
		"01077598490",
		"01078937420",
		"01039118830",
		"01046449421",
		"01048252602",
		"01089957844",
		"01090145897",
		"01003805663",
		"01054833114",
		"01052000817",
		"01014133889",
		"01064622536",
		"01058658919",
		"01021885728",
		"01056480481",
		"01067732234",
		"01004000726",
		"01061010910",
		"01012829208",
		"01065866569",
		"01050503935",
		"01056219896",
		"01007035054",
		"01046732182",
		"01013011262",
		"01010622397",
		"01095988782",
		"01080727618",
		"01071134422",
		"01060256387",
		"01010453477",
		"01073536364",
		"01074597570",
		"01090650012",
		"01064314949",
		"01007794823",
		"01069128482",
		"01019963241",
		"01035081059",
		"01067163383",
		"01058388740",
		"01078933110",
		"01082371258",
		"01096477291",
		"01090655412",
		"01086220250",
		"01097450276",
		"01097200415",
		"01067577642",
		"01002824867",
		"01056441646",
		"01027242674",
		"01005515645",
		"01093955573",
		"01009249166",
		"01020162837",
		"01009456613",
		"01051690827",
		"01051221828",
		"01066158752",
		"01000682859",
		"01067475676",
		"01006077771",
		"01063076415",
		"01096133167",
		"01027512090",
		"01091573244",
		"01050561737",
		"01006809173",
		"01043471444",
		"01026290688",
		"01059850865",
		"01031628430",
		"01021522300",
		"01030961904",
		"01007173717",
		"01067341630",
		"01029696002",
		"01024365707",
		"01046598196",
		"01056683087",
		"01016943582",
		"01091039891",
		"01058967613",
		"01018720402",
		"01027916973",
		"01044748868",
		"01035741954",
		"01038712525",
		"01067930611",
		"01059023986",
		"01028371339",
		"01029705317",
		"01086348415",
		"01094935358",
		"01016808071",
		"01077212073",
		"01097179116",
		"01068769908",
		"01020826269",
		"01001245368",
		"01087220035",
		"01050486148",
		"01015781345",
		"01036184337",
		"01000214462",
		"01028810780",
		"01073796451",
		"01029579701",
		"01097253288",
		"01052416350",
		"01084853729",
		"01065170427",
		"01037460576",
		"01014066115",
		"01041802652",
		"01008293616",
		"01004709500",
		"01010165644",
		"01039954504",
		"01066633832",
		"01068185097",
		"01091026656",
		"01035609116",
		"01088968102",
		"01052106481",
		"01027218567",
		"01005226762",
		"01050031267",
		"01069860214",
		"01060681281",
		"01043974921",
		"01035083519",
		"01064646362",
		"01022691012",
		"01063134605",
		"01083444353",
		"01041616161",
		"01098097745",
		"01087760920",
		"01065230668",
		"01015271918",
		"01092112626",
		"01065400810",
		"01088938145",
		"01018063754",
		"01050275154",
		"01085586900",
		"01076763979",
		"01066828548",
		"01018233656",
		"01005705515",
		"01058280619",
		"01083513458",
		"01094456738",
		"01011124695",
		"01076796768",
		"01049792853",
		"01090908794",
		"01075322002",
		"01003647259",
		"01003474935",
		"01085734415",
		"01077939164",
		"01064522429",
		"01038830739",
		"01010473657",
		"01034638292",
		"01074129801",
		"01075706020",
		"01024867322",
		"01083866168",
		"01048088314",
		"01045525914",
		"01060276918",
		"01010568131",
		"01078174164",
		"01062374121",
		"01065134423",
		"01081361387",
		"01061343007",
		"01050664431",
		"01091676554",
		"01060791500",
		"01005922368",
		"01046059721",
		"01061024977",
		"01076802156",
		"01060405966",
		"01072962538",
		"01019774783",
		"01089124906",
		"01078587316",
		"01008399876",
		"01042827664",
		"01012948678",
		"01081389223",
		"01092073212",
		"01042139865",
		"01096262698",
		"01087937419",
		"01052615339",
		"01001409263",
		"01099015594",
		"01068593186",
		"01035819181",
		"01008004717",
		"01034978013",
		"01074850527",
		"01062733513",
		"01016470739",
		"01011514898",
		"01080473305",
		"01038956792",
		"01098196427",
		"01005460593",
		"01050000347",
		"01065472020",
		"01090175112",
		"01047535280",
		"01080179608",
		"01059768863",
		"01087006023",
		"01070502766",
		"01048111100",
		"01089131308",
		"01040024055",
		"01009470511",
		"01092256157",
		"01054822125",
		"01000614133",
		"01070326608",
		"01082651867",
		"01097243376",
		"01048149111",
		"01043997656",
		"01021315580",
		"01078346732",
		"01038849793",
		"01024128698",
		"01052335188",
		"01045576802",
		"01067394279",
		"01091807020",
		"01008578538",
		"01052907396",
		"01001977767",
		"01049084459",
		"01080664949",
		"01071586461",
		"01081453484",
		"01058139812",
		"01013396375",
		"01000493911",
		"01033113322",
		"01036442631",
		"01085220759",
		"01009684133",
		"01049032926",
		"01062280861",
		"01044115138",
		"01015471130",
		"01034183885",
		"01074637818",
		"01094092067",
		"01014112852",
		"01062270971",
		"01053809685",
		"01060425637",
		"01007200979",
		"01003175805",
		"01003896236",
		"01067423546",
		"01062263410",
		"01066576428",
		"01057565012",
		"01049216542",
		"01079473024",
		"01022915254",
		"01048763168",
		"01013625398",
		"01053929087",
		"01079171534",
		"01039233005",
		"01016986770",
		"01024175225",
		"01088402819",
		"01005536841",
		"01098388242",
		"01003464185",
		"01044722094",
		"01092112894",
		"01023334180",
		"01085841837",
		"01069513278",
		"01031174571",
		"01017479574",
		"01065464398",
		"01045451771",
		"01054858473",
		"01052199725",
		"01083431301",
		"01006359809",
		"01039203718",
		"01073467166",
		"01017328425",
		"01073953920",
		"01022138130",
		"01048764926",
		"01025243978",
		"01053965686",
		"01030888371",
		"01079497922",
		"01089511536",
		"01049168797",
		"01082697831",
		"01061226187",
		"01022736806",
		"01074429197",
		"01085015809",
		"01006070098",
		"01023742212",
		"01081705982",
		"01051281602",
		"01078883838",
		"01017912492",
		"01003205008",
		"01096008597",
		"01055314550",
		"01032979539",
		"01045840341",
		"01039669454",
		"01055799955",
		"01048635482",
		"01014631415",
		"01070686788",
		"01069395550",
		"01099162764",
		"01069490799",
		"01039285639",
		"01014238757",
		"01061774209",
		"01082553225",
		"01014314829",
		"01031952287",
		"01024332571",
		"01045067703",
		"01082725830",
		"01033396178",
		"01022848044",
		"01046510225",
		"01048150029",
		"01021005221",
		"01091800629",
		"01059832429",
		"01063312314",
		"01013967874",
		"01089899337",
		"01010042772",
		"01001722791",
		"01060222481",
		"01057383981",
		"01095228004",
		"01024951434",
		"01048847080",
		"01039177626",
		"01005982181",
		"01002326759",
		"01002667046",
		"01033650349",
		"01000424151",
		"01033698279",
		"01061907797",
		"01055526894",
		"01092120945",
		"01009180411",
		"01015775864",
		"01081687937",
		"01069146387",
		"01070706812",
		"01050830883",
		"01005514195",
		"01098772908",
		"01035844801",
		"01060906814",
		"01067818475",
		"01062645928",
		"01027675133",
		"01020673296",
		"01013644659",
		"01043231128",
		"01060164739",
		"01073272306",
		"01052983327",
		"01057300305",
		"01069262402",
		"01065348930",
		"01081119415",
		"01009198899",
		"01017432030",
		"01013602416",
		"01081418435",
		"01045061511",
		"01047968107",
		"01007181878",
		"01046827987",
		"01036097282",
		"01040819144",
		"01055257828",
		"01026208616",
		"01074398823",
		"01006368918",
		"01043129817",
		"01021906504",
		"01075423700",
		"01086683150",
		"01037526471",
		"01014392556",
		"01031143705",
		"01010328780",
		"01065047885",
		"01043937100",
		"01005734252",
		"01068425598",
		"01041821444",
		"01042685496",
		"01041045955",
		"01071527329",
		"01015092163",
		"01038082455",
		"01081838359",
		"01090742487",
		"01020962541",
		"01026752971",
		"01061704736",
		"01089254939",
		"01087517120",
		"01057470515",
		"01024357810",
		"01074648847",
		"01077394746",
		"01074103754",
		"01010280628",
		"01004418162",
		"01079765159",
		"01084487404",
		"01058338745",
		"01098029741",
		"01084600012",
		"01094049849",
		"01085212476",
		"01050724492",
		"01009905066",
		"01049059986",
		"01082665597",
		"01009160458",
		"01051262703",
		"01020571969",
		"01022688242",
		"01051321157",
		"01053351678",
		"01018961205",
		"01081983596",
		"01060779408",
		"01078509465",
		"01045302378",
		"01087353032",
		"01009712295",
		"01001401641",
		"01075168359",
		"01088845645",
		"01097696765",
		"01070754987",
		"01020116449",
		"01019540905"		
	};
	
	

}
