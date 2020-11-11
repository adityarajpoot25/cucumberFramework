$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("End2End_Test.feature");
formatter.feature({
  "line": 2,
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.before({
  "duration": 5037345418,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Customer place an order by purchasing an item from search",
  "description": "",
  "id": "title-of-your-feature;customer-place-an-order-by-purchasing-an-item-from-search",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "he search for \"bags\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "choose to buy the first item",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "moves to checkout from mini cart",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "enter personal details on checkout page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "select same delivery address",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "place the order",
  "keyword": "And "
});
formatter.match({
  "location": "PLPPageSteps.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 26263350048,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bags",
      "offset": 15
    }
  ],
  "location": "PLPPageSteps.he_search_for(String)"
});
formatter.result({
  "duration": 36630791631,
  "status": "passed"
});
formatter.match({
  "location": "PLPPageSteps.choose_to_buy_the_first_item()"
});
formatter.result({
  "duration": 26337905127,
  "status": "passed"
});
formatter.match({
  "location": "PDPPageSteps.moves_to_checkout_from_mini_cart()"
});
formatter.result({
  "duration": 34181289522,
  "status": "passed"
});
formatter.match({
  "location": "ShippingPageSteps.enter_personal_details_on_checkout_page()"
});
formatter.result({
  "duration": 56449956412,
  "status": "passed"
});
formatter.match({
  "location": "BillingPageSteps.select_same_delivery_address()"
});
formatter.result({
  "duration": 15039171356,
  "status": "passed"
});
formatter.match({
  "location": "ReviewPageSteps.place_the_order()"
});
formatter.result({
  "duration": 21458518344,
  "status": "passed"
});
formatter.after({
  "duration": 258214052,
  "status": "passed"
});
});