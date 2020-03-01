$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Amazon_Login_Test.feature");
formatter.feature({
  "line": 1,
  "name": "Product search from amazon.com",
  "description": "User wants to search for Product",
  "id": "product-search-from-amazon.com",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Product Search should appear",
  "description": "",
  "id": "product-search-from-amazon.com;product-search-should-appear",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user search for \"Software Development\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "click on search button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "results should appear for \"Software Development \"",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonStepDef.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 10279282300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Software Development",
      "offset": 17
    }
  ],
  "location": "AmazonStepDef.user_search_for(String)"
});
formatter.result({
  "duration": 1880812500,
  "status": "passed"
});
formatter.match({
  "location": "AmazonStepDef.click_on_search_button()"
});
formatter.result({
  "duration": 2788356600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Software Development ",
      "offset": 27
    }
  ],
  "location": "AmazonStepDef.results_should_appear(String)"
});
formatter.result({
  "duration": 1620708900,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Product Search should  appear",
  "description": "",
  "id": "product-search-from-amazon.com;product-search-should--appear",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "user search for \" \"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "click on search button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "results should appear for \" \"",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonStepDef.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 9445342800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " ",
      "offset": 17
    }
  ],
  "location": "AmazonStepDef.user_search_for(String)"
});
formatter.result({
  "duration": 773953100,
  "status": "passed"
});
formatter.match({
  "location": "AmazonStepDef.click_on_search_button()"
});
formatter.result({
  "duration": 2667469600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " ",
      "offset": 27
    }
  ],
  "location": "AmazonStepDef.results_should_appear(String)"
});
formatter.result({
  "duration": 1040911900,
  "status": "passed"
});
});