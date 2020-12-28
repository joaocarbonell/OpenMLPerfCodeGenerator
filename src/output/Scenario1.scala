package scenariolabel 

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class Scenario1 extends Simulation{



	object Edit {



val feederAllCategories ("AllCategories").random





val feederAllBookscsv ("AllBooks.csv").random




	

	val edit = scenario("RecordedSimulation")

	
	
	
			.exec(http("request_0")
			.get("url/outrocaminho1")
	
			
	
	
	
			.exec(http("request_0")
			.get("url/outrocaminho2")
	
			
	
	
	
			.exec(http("request_0")
			.get("url/outrocaminho3")
	
			.feed(feederAllCategories)

	
	
	
			.exec(http("request_0")
			.get("url/outrocaminho4")
	
			.feed(feederAllCategories)

	
	
	
			.exec(http("request_0")
			.get("url/outrocaminho5")
	
			.feed(feederAllBookscsv)

	
	
	
			.exec(http("request_0")
			.get("url\outrocaminho6")
	
			
	


	
	}

	object Browser {



val feederSubjectcsv ("Subject.csv").random





val feederBooksByCategorycsv ("BooksByCategory.csv").random





val feederSearchResultscsv ("SearchResults.csv").random




	

	val browser = scenario("RecordedSimulation")

	
	
	
			.exec(http("request_0")
			.get("\urlsec")
	
			
	
	
	
			.exec(http("request_0")
			.get("\urlsec")
	
			.feed(feederSubjectcsv)

	
	
	
			.exec(http("request_0")
			.get("\urlsec")
	
			.feed(feederSubjectcsv)

	
	
	
			.exec(http("request_0")
			.get("")
	
			.feed(feederBooksByCategorycsv)

	
	
	
			.exec(http("request_0")
			.get("")
	
			
	
	
	
			.exec(http("request_0")
			.get("")
	
			.feed(feederSearchResultscsv)

	


	
	}

	object Buy {


	

	val buy = scenario("RecordedSimulation")

	


	
	}

	//Shopping 25%
	//Browsing 15%

	//Load Testing : 10000 virtual users
		100
		5000
	//Endurance Testing : 2000 virtual users
		0
		500

val httpProtocol = http
		.baseUrl("www.algumsite.com/home")
		.inferHtmlResources()
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7,sv;q=0.6")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/84.0.4147.125 Safari/537.36")

val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "none",
		"Sec-Fetch-User" -> "?1",
		"Upgrade-Insecure-Requests" -> "1")



}

