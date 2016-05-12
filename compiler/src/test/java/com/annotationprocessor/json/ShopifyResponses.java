package com.annotationprocessor.json;

import com.mycardboarddreams.api.Jsonify;

/**
 * Created by ykulbashian on 16-04-14.
 */
public class ShopifyResponses {

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify0 = "" +
            "{" +
            "    \"body\": {" +
            "        \"product_publications\": [{" +
            "            \"id\": 2626498435," +
            "            \"product_id\": 2096063363," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"updated_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"body_html\": \"parsing the driver won't do anything, we need to calculate the online PNG program!\"," +
            "            \"handle\": \"actinian-fur-hat\"," +
            "            \"product_type\": \"enable bricks-and-clicks e-business\"," +
            "            \"title\": \"Actinian Fur Hat\"," +
            "            \"vendor\": \"McCullough Group\"," +
            "            \"published_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"\"," +
            "            \"images\": [{" +
            "                \"id\": 4277333187," +
            "                \"created_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"position\": 1," +
            "                \"updated_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"product_id\": 2096063363," +
            "                \"src\": \"https:\\\\/\\\\/cdn.shopify.com\\\\/s\\\\/files\\\\/1\\\\/0957\\\\/5792\\\\/products\\\\/Kraepelin3.gif?v=1439489564\"," +
            "                \"variant_ids\": []" +
            "            }]," +
            "            \"options\": [{" +
            "                \"id\": 2524801731," +
            "                \"name\": \"Color or something\"," +
            "                \"product_id\": 2096063363," +
            "                \"position\": 1" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 6030700419," +
            "                \"title\": \"Teal\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2524801731," +
            "                    \"name\": \"Color or something\"," +
            "                    \"value\": \"Teal\"" +
            "                }]," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 4000," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": false," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }]" +
            "        }]" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify1 =
            "{" +
            "    \"body\": {" +
            "        \"checkout\": {" +
            "            \"created_at\": \"2015-09-21T16:19:13-04:00\"," +
            "            \"currency\": \"CAD\"," +
            "            \"customer_id\": null," +
            "            \"email\": \"test@test.com\"," +
            "            \"location_id\": null," +
            "            \"order_id\": null," +
            "            \"requires_shipping\": true," +
            "            \"reservation_time\": 300," +
            "            \"source_name\": \"mobile_app\"," +
            "            \"source_identifier\": \"26915715\"," +
            "            \"source_url\": null," +
            "            \"taxes_included\": false," +
            "            \"token\": \"c128f1b20ee5b0d9959ce2ac877447f7\"," +
            "            \"updated_at\": \"2015-09-21T16:19:13-04:00\"," +
            "            \"payment_due\": \"2230.99\"," +
            "            \"payment_url\": \"https:\\\\/\\\\/us-west-2-deposit.cs.shopify.com\\\\/sessions\"," +
            "            \"reservation_time_left\": 300," +
            "            \"subtotal_price\": \"2230.99\"," +
            "            \"total_price\": \"2230.99\"," +
            "            \"total_tax\": \"0.00\"," +
            "            \"order_status_url\": null," +
            "            \"privacy_policy_url\": null," +
            "            \"refund_policy_url\": null," +
            "            \"terms_of_service_url\": null," +
            "            \"web_url\": \"https:\\\\/\\\\/checkout.shopify.com\\\\/9575792\\\\/checkouts\\\\/c128f1b20ee5b0d9959ce2ac877447f7\"," +
            "            \"tax_lines\": []," +
            "            \"line_items\": [{" +
            "                \"id\": \"94a1ad4d716a7790\"," +
            "                \"product_id\": 2096063363," +
            "                \"variant_id\": 6030700419," +
            "                \"sku\": \"\"," +
            "                \"vendor\": \"McCullough Group\"," +
            "                \"title\": \"Actinian Fur Hat\"," +
            "                \"variant_title\": \"Teal\"," +
            "                \"taxable\": false," +
            "                \"requires_shipping\": true," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"line_price\": \"2230.99\"," +
            "                \"properties\": {" +
            "                    \"size\": \"large\"," +
            "                    \"color\": \"red\"" +
            "                }," +
            "                \"quantity\": 1," +
            "                \"grams\": 4000," +
            "                \"fulfillment_service\": \"manual\"" +
            "            }]," +
            "            \"gift_cards\": []," +
            "            \"shipping_rate\": null," +
            "            \"billing_address\": {" +
            "                \"first_name\": \"---\"," +
            "                \"last_name\": \"---\"," +
            "                \"phone\": \"---\"," +
            "                \"address1\": \"---\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"credit_card\": null," +
            "            \"discount\": null" +
            "        }" +
            "    }," +
            "    \"code\": 201," +
            "    \"message\": \"Created\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify4 =
            "{" +
            "    \"body\": {" +
            "        \"product_publications\": [{" +
            "            \"id\": 3186044355," +
            "            \"product_id\": 2576257283," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-09-14T11:23:04-04:00\"," +
            "            \"updated_at\": \"2015-10-08T12:46:33-04:00\"," +
            "            \"body_html\": \"A shirt with lots of variants\"," +
            "            \"handle\": \"shirt\"," +
            "            \"product_type\": \"\"," +
            "            \"title\": \"Shirt\"," +
            "            \"vendor\": \"MobileBuySDKTestShop\"," +
            "            \"published_at\": \"2015-09-14T11:23:03-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"cotton, summer, Vintage\"," +
            "            \"images\": []," +
            "            \"options\": [{" +
            "                \"id\": 3098335939," +
            "                \"name\": \"Size\"," +
            "                \"product_id\": 2576257283," +
            "                \"position\": 1" +
            "            }, {" +
            "                \"id\": 3098336003," +
            "                \"name\": \"Neck\"," +
            "                \"product_id\": 2576257283," +
            "                \"position\": 2" +
            "            }, {" +
            "                \"id\": 3098336067," +
            "                \"name\": \"Color\"," +
            "                \"product_id\": 2576257283," +
            "                \"position\": 3" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 7522060675," +
            "                \"title\": \"Small \\\\/ V-Neck \\\\/ Blue\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Blue\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522060739," +
            "                \"title\": \"Small \\\\/ V-Neck \\\\/ Red\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Red\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 2," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522060867," +
            "                \"title\": \"Small \\\\/ V-Neck \\\\/ Green\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Green\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 3," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522061123," +
            "                \"title\": \"Small \\\\/ V-Neck \\\\/ Black\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Black\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 4," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522061315," +
            "                \"title\": \"Small \\\\/ V-Neck \\\\/ White\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"White\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 5," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522061635," +
            "                \"title\": \"Small \\\\/ Crew Neck \\\\/ Blue\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Blue\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 6," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522061891," +
            "                \"title\": \"Small \\\\/ Crew Neck \\\\/ Red\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Red\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 7," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522062147," +
            "                \"title\": \"Small \\\\/ Crew Neck \\\\/ Green\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Green\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 8," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522062339," +
            "                \"title\": \"Small \\\\/ Crew Neck \\\\/ Black\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Black\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 9," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522062531," +
            "                \"title\": \"Small \\\\/ Crew Neck \\\\/ White\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"White\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 10," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522062787," +
            "                \"title\": \"Medium \\\\/ V-Neck \\\\/ Blue\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Blue\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 11," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522063043," +
            "                \"title\": \"Medium \\\\/ V-Neck \\\\/ Red\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Red\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 12," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522063235," +
            "                \"title\": \"Medium \\\\/ V-Neck \\\\/ Green\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Green\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 13," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522063491," +
            "                \"title\": \"Medium \\\\/ V-Neck \\\\/ Black\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Black\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 14," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522063683," +
            "                \"title\": \"Medium \\\\/ V-Neck \\\\/ White\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"White\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 15," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522064003," +
            "                \"title\": \"Medium \\\\/ Crew Neck \\\\/ Blue\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Blue\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 16," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522064323," +
            "                \"title\": \"Medium \\\\/ Crew Neck \\\\/ Red\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Red\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 17," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522064643," +
            "                \"title\": \"Medium \\\\/ Crew Neck \\\\/ Green\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Green\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 18," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522065091," +
            "                \"title\": \"Medium \\\\/ Crew Neck \\\\/ Black\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Black\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 19," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522065475," +
            "                \"title\": \"Medium \\\\/ Crew Neck \\\\/ White\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"White\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 20," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522065731," +
            "                \"title\": \"Large \\\\/ V-Neck \\\\/ Blue\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Blue\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 21," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522066051," +
            "                \"title\": \"Large \\\\/ V-Neck \\\\/ Red\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Red\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 22," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522066435," +
            "                \"title\": \"Large \\\\/ V-Neck \\\\/ Green\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Green\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 23," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522066819," +
            "                \"title\": \"Large \\\\/ V-Neck \\\\/ Black\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Black\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 24," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522067203," +
            "                \"title\": \"Large \\\\/ V-Neck \\\\/ White\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"White\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 25," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522067523," +
            "                \"title\": \"Large \\\\/ Crew Neck \\\\/ Blue\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Blue\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 26," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522067843," +
            "                \"title\": \"Large \\\\/ Crew Neck \\\\/ Red\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Red\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 27," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522068099," +
            "                \"title\": \"Large \\\\/ Crew Neck \\\\/ Green\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Green\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 28," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522068483," +
            "                \"title\": \"Large \\\\/ Crew Neck \\\\/ Black\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Black\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 29," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522068739," +
            "                \"title\": \"Large \\\\/ Crew Neck \\\\/ White\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"White\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 30," +
            "                \"available\": true" +
            "            }]" +
            "        }]" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify5 =
            "{" +
            "    \"body\": {" +
            "        \"product_publications\": [{" +
            "            \"id\": 3186044355," +
            "            \"product_id\": 2576257283," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-09-14T11:23:04-04:00\"," +
            "            \"updated_at\": \"2015-10-08T12:46:33-04:00\"," +
            "            \"body_html\": \"A shirt with lots of variants\"," +
            "            \"handle\": \"shirt\"," +
            "            \"product_type\": \"\"," +
            "            \"title\": \"Shirt\"," +
            "            \"vendor\": \"MobileBuySDKTestShop\"," +
            "            \"published_at\": \"2015-09-14T11:23:03-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"cotton, summer, Vintage\"," +
            "            \"images\": []," +
            "            \"options\": [{" +
            "                \"id\": 3098335939," +
            "                \"name\": \"Size\"," +
            "                \"product_id\": 2576257283," +
            "                \"position\": 1" +
            "            }, {" +
            "                \"id\": 3098336003," +
            "                \"name\": \"Neck\"," +
            "                \"product_id\": 2576257283," +
            "                \"position\": 2" +
            "            }, {" +
            "                \"id\": 3098336067," +
            "                \"name\": \"Color\"," +
            "                \"product_id\": 2576257283," +
            "                \"position\": 3" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 7522060675," +
            "                \"title\": \"Small \\\\/ V-Neck \\\\/ Blue\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Blue\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522060739," +
            "                \"title\": \"Small \\\\/ V-Neck \\\\/ Red\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Red\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 2," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522060867," +
            "                \"title\": \"Small \\\\/ V-Neck \\\\/ Green\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Green\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 3," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522061123," +
            "                \"title\": \"Small \\\\/ V-Neck \\\\/ Black\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Black\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 4," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522061315," +
            "                \"title\": \"Small \\\\/ V-Neck \\\\/ White\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"White\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 5," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522061635," +
            "                \"title\": \"Small \\\\/ Crew Neck \\\\/ Blue\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Blue\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 6," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522061891," +
            "                \"title\": \"Small \\\\/ Crew Neck \\\\/ Red\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Red\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 7," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522062147," +
            "                \"title\": \"Small \\\\/ Crew Neck \\\\/ Green\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Green\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 8," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522062339," +
            "                \"title\": \"Small \\\\/ Crew Neck \\\\/ Black\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Black\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 9," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522062531," +
            "                \"title\": \"Small \\\\/ Crew Neck \\\\/ White\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"White\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 10," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522062787," +
            "                \"title\": \"Medium \\\\/ V-Neck \\\\/ Blue\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Blue\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 11," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522063043," +
            "                \"title\": \"Medium \\\\/ V-Neck \\\\/ Red\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Red\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 12," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522063235," +
            "                \"title\": \"Medium \\\\/ V-Neck \\\\/ Green\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Green\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 13," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522063491," +
            "                \"title\": \"Medium \\\\/ V-Neck \\\\/ Black\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Black\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 14," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522063683," +
            "                \"title\": \"Medium \\\\/ V-Neck \\\\/ White\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"White\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 15," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522064003," +
            "                \"title\": \"Medium \\\\/ Crew Neck \\\\/ Blue\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Blue\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 16," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522064323," +
            "                \"title\": \"Medium \\\\/ Crew Neck \\\\/ Red\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Red\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 17," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522064643," +
            "                \"title\": \"Medium \\\\/ Crew Neck \\\\/ Green\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Green\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 18," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522065091," +
            "                \"title\": \"Medium \\\\/ Crew Neck \\\\/ Black\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Black\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 19," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522065475," +
            "                \"title\": \"Medium \\\\/ Crew Neck \\\\/ White\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"White\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 20," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522065731," +
            "                \"title\": \"Large \\\\/ V-Neck \\\\/ Blue\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Blue\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 21," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522066051," +
            "                \"title\": \"Large \\\\/ V-Neck \\\\/ Red\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Red\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 22," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522066435," +
            "                \"title\": \"Large \\\\/ V-Neck \\\\/ Green\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Green\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 23," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522066819," +
            "                \"title\": \"Large \\\\/ V-Neck \\\\/ Black\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Black\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 24," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522067203," +
            "                \"title\": \"Large \\\\/ V-Neck \\\\/ White\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"White\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 25," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522067523," +
            "                \"title\": \"Large \\\\/ Crew Neck \\\\/ Blue\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Blue\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 26," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522067843," +
            "                \"title\": \"Large \\\\/ Crew Neck \\\\/ Red\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Red\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 27," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522068099," +
            "                \"title\": \"Large \\\\/ Crew Neck \\\\/ Green\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Green\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 28," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522068483," +
            "                \"title\": \"Large \\\\/ Crew Neck \\\\/ Black\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Black\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 29," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522068739," +
            "                \"title\": \"Large \\\\/ Crew Neck \\\\/ White\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"White\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 30," +
            "                \"available\": true" +
            "            }]" +
            "        }]" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify6 =
            "{" +
            "    \"body\": {" +
            "        \"product_publications\": [{" +
            "            \"id\": 2626498435," +
            "            \"product_id\": 2096063363," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"updated_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"body_html\": \"parsing the driver won't do anything, we need to calculate the online PNG program!\"," +
            "            \"handle\": \"actinian-fur-hat\"," +
            "            \"product_type\": \"enable bricks-and-clicks e-business\"," +
            "            \"title\": \"Actinian Fur Hat\"," +
            "            \"vendor\": \"McCullough Group\"," +
            "            \"published_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"\"," +
            "            \"images\": [{" +
            "                \"id\": 4277333187," +
            "                \"created_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"position\": 1," +
            "                \"updated_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"product_id\": 2096063363," +
            "                \"src\": \"https:\\\\/\\\\/cdn.shopify.com\\\\/s\\\\/files\\\\/1\\\\/0957\\\\/5792\\\\/products\\\\/Kraepelin3.gif?v=1439489564\"," +
            "                \"variant_ids\": []" +
            "            }]," +
            "            \"options\": [{" +
            "                \"id\": 2524801731," +
            "                \"name\": \"Color or something\"," +
            "                \"product_id\": 2096063363," +
            "                \"position\": 1" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 6030700419," +
            "                \"title\": \"Teal\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2524801731," +
            "                    \"name\": \"Color or something\"," +
            "                    \"value\": \"Teal\"" +
            "                }]," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 4000," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": false," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }]" +
            "        }]" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify7 =
            "{" +
            "    \"body\": {" +
            "        \"id\": 9575792," +
            "        \"name\": \"MobileBuySDKTestShop\"," +
            "        \"city\": \"Richmond Hill\"," +
            "        \"province\": \"Ontario\"," +
            "        \"country\": \"CA\"," +
            "        \"currency\": \"CAD\"," +
            "        \"domain\": \"mobilebuysdktestshop.myshopify.com\"," +
            "        \"url\": \"http:\\\\/\\\\/mobilebuysdktestshop.myshopify.com\"," +
            "        \"myshopify_domain\": \"mobilebuysdktestshop.myshopify.com\"," +
            "        \"description\": \"\"," +
            "        \"ships_to_countries\": [\"*\", \"CA\"]," +
            "        \"money_format\": \"${{amount}}\"," +
            "        \"published_collections_count\": 1," +
            "        \"published_products_count\": 11" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify8 =
            "{" +
            "    \"body\": {" +
            "        \"product_publications\": [{" +
            "            \"id\": 2626498435," +
            "            \"product_id\": 2096063363," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"updated_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"body_html\": \"parsing the driver won't do anything, we need to calculate the online PNG program!\"," +
            "            \"handle\": \"actinian-fur-hat\"," +
            "            \"product_type\": \"enable bricks-and-clicks e-business\"," +
            "            \"title\": \"Actinian Fur Hat\"," +
            "            \"vendor\": \"McCullough Group\"," +
            "            \"published_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"\"," +
            "            \"images\": [{" +
            "                \"id\": 4277333187," +
            "                \"created_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"position\": 1," +
            "                \"updated_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"product_id\": 2096063363," +
            "                \"src\": \"https:\\\\/\\\\/cdn.shopify.com\\\\/s\\\\/files\\\\/1\\\\/0957\\\\/5792\\\\/products\\\\/Kraepelin3.gif?v=1439489564\"," +
            "                \"variant_ids\": []" +
            "            }]," +
            "            \"options\": [{" +
            "                \"id\": 2524801731," +
            "                \"name\": \"Color or something\"," +
            "                \"product_id\": 2096063363," +
            "                \"position\": 1" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 6030700419," +
            "                \"title\": \"Teal\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2524801731," +
            "                    \"name\": \"Color or something\"," +
            "                    \"value\": \"Teal\"" +
            "                }]," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 4000," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": false," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }]" +
            "        }]" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify9 =
            "{" +
            "    \"body\": {" +
            "        \"checkout\": {" +
            "            \"created_at\": \"2016-03-07T10:20:43-05:00\"," +
            "            \"currency\": \"CAD\"," +
            "            \"customer_id\": 1137418883," +
            "            \"email\": \"test@test.com\"," +
            "            \"location_id\": null," +
            "            \"order_id\": null," +
            "            \"requires_shipping\": true," +
            "            \"reservation_time\": 300," +
            "            \"source_name\": \"mobile_app\"," +
            "            \"source_identifier\": \"26915715\"," +
            "            \"source_url\": null," +
            "            \"taxes_included\": false," +
            "            \"token\": \"a6168007b03f6e6338ab680fe58dcdaa\"," +
            "            \"updated_at\": \"2016-03-07T10:20:43-05:00\"," +
            "            \"payment_due\": \"2230.99\"," +
            "            \"payment_url\": \"https:\\\\/\\\\/elb.deposit.shopifycs.com\\\\/sessions\"," +
            "            \"reservation_time_left\": 300," +
            "            \"subtotal_price\": \"2230.99\"," +
            "            \"total_price\": \"2230.99\"," +
            "            \"total_tax\": \"0.00\"," +
            "            \"attributes\": []," +
            "            \"note\": \"\"," +
            "            \"order\": null," +
            "            \"order_status_url\": null," +
            "            \"privacy_policy_url\": null," +
            "            \"refund_policy_url\": null," +
            "            \"terms_of_service_url\": null," +
            "            \"user_id\": null," +
            "            \"web_url\": \"https:\\\\/\\\\/checkout.shopify.com\\\\/9575792\\\\/checkouts\\\\/a6168007b03f6e6338ab680fe58dcdaa\"," +
            "            \"tax_lines\": []," +
            "            \"line_items\": [{" +
            "                \"id\": \"a9894df424123912\"," +
            "                \"product_id\": 2096063363," +
            "                \"variant_id\": 6030700419," +
            "                \"sku\": \"\"," +
            "                \"vendor\": \"McCullough Group\"," +
            "                \"title\": \"Actinian Fur Hat\"," +
            "                \"variant_title\": \"Teal\"," +
            "                \"taxable\": false," +
            "                \"requires_shipping\": true," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"line_price\": \"2230.99\"," +
            "                \"properties\": {" +
            "                    \"size\": \"large\"," +
            "                    \"color\": \"red\"" +
            "                }," +
            "                \"quantity\": 1," +
            "                \"grams\": 4000," +
            "                \"fulfillment_service\": \"manual\"," +
            "                \"applied_discounts\": []" +
            "            }]," +
            "            \"gift_cards\": []," +
            "            \"shipping_rate\": null," +
            "            \"shipping_address\": {" +
            "                \"id\": 3479862470," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"credit_card\": null," +
            "            \"billing_address\": {" +
            "                \"id\": 3479862406," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"discount\": null" +
            "        }" +
            "    }," +
            "    \"code\": 201," +
            "    \"message\": \"Created\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify10 =
            "{" +
            "    \"body\": {" +
            "        \"errors\": {" +
            "            \"gift_card\": {" +
            "                \"code\": [{" +
            "                    \"code\": \"gift_card_expired\"," +
            "                    \"message\": \"Gift card is expired\"," +
            "                    \"options\": {}" +
            "                }]" +
            "            }" +
            "        }" +
            "    }," +
            "    \"code\": 422," +
            "    \"message\": \"Unprocessable Entity\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify11 =
            "{" +
            "    \"body\": {" +
            "        \"product_publications\": [{" +
            "            \"id\": 2626498435," +
            "            \"product_id\": 2096063363," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"updated_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"body_html\": \"parsing the driver won't do anything, we need to calculate the online PNG program!\"," +
            "            \"handle\": \"actinian-fur-hat\"," +
            "            \"product_type\": \"enable bricks-and-clicks e-business\"," +
            "            \"title\": \"Actinian Fur Hat\"," +
            "            \"vendor\": \"McCullough Group\"," +
            "            \"published_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"\"," +
            "            \"images\": [{" +
            "                \"id\": 4277333187," +
            "                \"created_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"position\": 1," +
            "                \"updated_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"product_id\": 2096063363," +
            "                \"src\": \"https:\\\\/\\\\/cdn.shopify.com\\\\/s\\\\/files\\\\/1\\\\/0957\\\\/5792\\\\/products\\\\/Kraepelin3.gif?v=1439489564\"," +
            "                \"variant_ids\": []" +
            "            }]," +
            "            \"options\": [{" +
            "                \"id\": 2524801731," +
            "                \"name\": \"Color or something\"," +
            "                \"product_id\": 2096063363," +
            "                \"position\": 1" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 6030700419," +
            "                \"title\": \"Teal\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2524801731," +
            "                    \"name\": \"Color or something\"," +
            "                    \"value\": \"Teal\"" +
            "                }]," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 4000," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": false," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }]" +
            "        }]" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify12 =
            "{" +
            "    \"body\": {" +
            "        \"checkout\": {" +
            "            \"created_at\": \"2016-03-07T10:20:44-05:00\"," +
            "            \"currency\": \"CAD\"," +
            "            \"customer_id\": 1137418883," +
            "            \"email\": \"test@test.com\"," +
            "            \"location_id\": null," +
            "            \"order_id\": null," +
            "            \"requires_shipping\": true," +
            "            \"reservation_time\": 300," +
            "            \"source_name\": \"mobile_app\"," +
            "            \"source_identifier\": \"26915715\"," +
            "            \"source_url\": null," +
            "            \"taxes_included\": false," +
            "            \"token\": \"c579922af052e311a6e23c48d5e3daf3\"," +
            "            \"updated_at\": \"2016-03-07T10:20:44-05:00\"," +
            "            \"payment_due\": \"2230.99\"," +
            "            \"payment_url\": \"https:\\\\/\\\\/elb.deposit.shopifycs.com\\\\/sessions\"," +
            "            \"reservation_time_left\": 300," +
            "            \"subtotal_price\": \"2230.99\"," +
            "            \"total_price\": \"2230.99\"," +
            "            \"total_tax\": \"0.00\"," +
            "            \"attributes\": []," +
            "            \"note\": \"\"," +
            "            \"order\": null," +
            "            \"order_status_url\": null," +
            "            \"privacy_policy_url\": null," +
            "            \"refund_policy_url\": null," +
            "            \"terms_of_service_url\": null," +
            "            \"user_id\": null," +
            "            \"web_url\": \"https:\\\\/\\\\/checkout.shopify.com\\\\/9575792\\\\/checkouts\\\\/c579922af052e311a6e23c48d5e3daf3\"," +
            "            \"tax_lines\": []," +
            "            \"line_items\": [{" +
            "                \"id\": \"f0dea6f2f6c5fbd6\"," +
            "                \"product_id\": 2096063363," +
            "                \"variant_id\": 6030700419," +
            "                \"sku\": \"\"," +
            "                \"vendor\": \"McCullough Group\"," +
            "                \"title\": \"Actinian Fur Hat\"," +
            "                \"variant_title\": \"Teal\"," +
            "                \"taxable\": false," +
            "                \"requires_shipping\": true," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"line_price\": \"2230.99\"," +
            "                \"properties\": {" +
            "                    \"size\": \"large\"," +
            "                    \"color\": \"red\"" +
            "                }," +
            "                \"quantity\": 1," +
            "                \"grams\": 4000," +
            "                \"fulfillment_service\": \"manual\"," +
            "                \"applied_discounts\": []" +
            "            }]," +
            "            \"gift_cards\": []," +
            "            \"shipping_rate\": null," +
            "            \"shipping_address\": {" +
            "                \"id\": 3479862918," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"credit_card\": null," +
            "            \"billing_address\": {" +
            "                \"id\": 3479862854," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"discount\": null" +
            "        }" +
            "    }," +
            "    \"code\": 201," +
            "    \"message\": \"Created\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify13 =
            "{" +
            "    \"body\": {" +
            "        \"gift_card\": {" +
            "            \"id\": 9740870," +
            "            \"last_characters\": \"rd11\"," +
            "            \"balance\": \"11.00\"," +
            "            \"amount_used\": \"11.00\"," +
            "            \"checkout\": {" +
            "                \"payment_due\": \"2219.99\"" +
            "            }" +
            "        }" +
            "    }," +
            "    \"code\": 201," +
            "    \"message\": \"Created\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify14 =
            "{" +
            "    \"body\": {" +
            "        \"checkout\": {" +
            "            \"created_at\": \"2016-03-07T10:20:44-05:00\"," +
            "            \"currency\": \"CAD\"," +
            "            \"customer_id\": 1137418883," +
            "            \"email\": \"test@test.com\"," +
            "            \"location_id\": null," +
            "            \"order_id\": null," +
            "            \"requires_shipping\": true," +
            "            \"reservation_time\": 300," +
            "            \"source_name\": \"mobile_app\"," +
            "            \"source_identifier\": \"26915715\"," +
            "            \"source_url\": null," +
            "            \"taxes_included\": false," +
            "            \"token\": \"c579922af052e311a6e23c48d5e3daf3\"," +
            "            \"updated_at\": \"2016-03-07T10:20:46-05:00\"," +
            "            \"payment_due\": \"2219.99\"," +
            "            \"payment_url\": \"https:\\\\/\\\\/elb.deposit.shopifycs.com\\\\/sessions\"," +
            "            \"reservation_time_left\": 300," +
            "            \"subtotal_price\": \"2230.99\"," +
            "            \"total_price\": \"2230.99\"," +
            "            \"total_tax\": \"0.00\"," +
            "            \"attributes\": []," +
            "            \"note\": \"\"," +
            "            \"order\": null," +
            "            \"order_status_url\": null," +
            "            \"privacy_policy_url\": null," +
            "            \"refund_policy_url\": null," +
            "            \"terms_of_service_url\": null," +
            "            \"user_id\": null," +
            "            \"web_url\": \"https:\\\\/\\\\/checkout.shopify.com\\\\/9575792\\\\/checkouts\\\\/c579922af052e311a6e23c48d5e3daf3\"," +
            "            \"tax_lines\": []," +
            "            \"line_items\": [{" +
            "                \"id\": \"e9bdf03ebe23af4a\"," +
            "                \"product_id\": 2096063363," +
            "                \"variant_id\": 6030700419," +
            "                \"sku\": \"\"," +
            "                \"vendor\": \"McCullough Group\"," +
            "                \"title\": \"Actinian Fur Hat\"," +
            "                \"variant_title\": \"Teal\"," +
            "                \"taxable\": false," +
            "                \"requires_shipping\": true," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"line_price\": \"2230.99\"," +
            "                \"properties\": {" +
            "                    \"size\": \"large\"," +
            "                    \"color\": \"red\"" +
            "                }," +
            "                \"quantity\": 1," +
            "                \"grams\": 4000," +
            "                \"fulfillment_service\": \"manual\"," +
            "                \"applied_discounts\": []" +
            "            }]," +
            "            \"gift_cards\": [{" +
            "                \"id\": 9740870," +
            "                \"last_characters\": \"rd11\"," +
            "                \"balance\": \"11.00\"," +
            "                \"amount_used\": \"11.00\"" +
            "            }]," +
            "            \"shipping_rate\": null," +
            "            \"shipping_address\": {" +
            "                \"id\": 3479862918," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"credit_card\": null," +
            "            \"billing_address\": {" +
            "                \"id\": 3479862854," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"discount\": null" +
            "        }" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify15 =
            "{" +
            "    \"body\": {" +
            "        \"product_publications\": [{" +
            "            \"id\": 2626498435," +
            "            \"product_id\": 2096063363," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"updated_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"body_html\": \"parsing the driver won't do anything, we need to calculate the online PNG program!\"," +
            "            \"handle\": \"actinian-fur-hat\"," +
            "            \"product_type\": \"enable bricks-and-clicks e-business\"," +
            "            \"title\": \"Actinian Fur Hat\"," +
            "            \"vendor\": \"McCullough Group\"," +
            "            \"published_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"\"," +
            "            \"images\": [{" +
            "                \"id\": 4277333187," +
            "                \"created_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"position\": 1," +
            "                \"updated_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"product_id\": 2096063363," +
            "                \"src\": \"https:\\\\/\\\\/cdn.shopify.com\\\\/s\\\\/files\\\\/1\\\\/0957\\\\/5792\\\\/products\\\\/Kraepelin3.gif?v=1439489564\"," +
            "                \"variant_ids\": []" +
            "            }]," +
            "            \"options\": [{" +
            "                \"id\": 2524801731," +
            "                \"name\": \"Color or something\"," +
            "                \"product_id\": 2096063363," +
            "                \"position\": 1" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 6030700419," +
            "                \"title\": \"Teal\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2524801731," +
            "                    \"name\": \"Color or something\"," +
            "                    \"value\": \"Teal\"" +
            "                }]," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 4000," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": false," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }]" +
            "        }]" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify16 =
            "{" +
            "    \"body\": {" +
            "        \"checkout\": {" +
            "            \"created_at\": \"2016-03-07T10:20:47-05:00\"," +
            "            \"currency\": \"CAD\"," +
            "            \"customer_id\": 1137418883," +
            "            \"email\": \"test@test.com\"," +
            "            \"location_id\": null," +
            "            \"order_id\": null," +
            "            \"requires_shipping\": true," +
            "            \"reservation_time\": 300," +
            "            \"source_name\": \"mobile_app\"," +
            "            \"source_identifier\": \"26915715\"," +
            "            \"source_url\": null," +
            "            \"taxes_included\": false," +
            "            \"token\": \"2c78b19db55fdba3c8eb65aef4114fca\"," +
            "            \"updated_at\": \"2016-03-07T10:20:47-05:00\"," +
            "            \"payment_due\": \"2230.99\"," +
            "            \"payment_url\": \"https:\\\\/\\\\/elb.deposit.shopifycs.com\\\\/sessions\"," +
            "            \"reservation_time_left\": 300," +
            "            \"subtotal_price\": \"2230.99\"," +
            "            \"total_price\": \"2230.99\"," +
            "            \"total_tax\": \"0.00\"," +
            "            \"attributes\": []," +
            "            \"note\": \"\"," +
            "            \"order\": null," +
            "            \"order_status_url\": null," +
            "            \"privacy_policy_url\": null," +
            "            \"refund_policy_url\": null," +
            "            \"terms_of_service_url\": null," +
            "            \"user_id\": null," +
            "            \"web_url\": \"https:\\\\/\\\\/checkout.shopify.com\\\\/9575792\\\\/checkouts\\\\/2c78b19db55fdba3c8eb65aef4114fca\"," +
            "            \"tax_lines\": []," +
            "            \"line_items\": [{" +
            "                \"id\": \"ec1fdecb3403b322\"," +
            "                \"product_id\": 2096063363," +
            "                \"variant_id\": 6030700419," +
            "                \"sku\": \"\"," +
            "                \"vendor\": \"McCullough Group\"," +
            "                \"title\": \"Actinian Fur Hat\"," +
            "                \"variant_title\": \"Teal\"," +
            "                \"taxable\": false," +
            "                \"requires_shipping\": true," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"line_price\": \"2230.99\"," +
            "                \"properties\": {" +
            "                    \"size\": \"large\"," +
            "                    \"color\": \"red\"" +
            "                }," +
            "                \"quantity\": 1," +
            "                \"grams\": 4000," +
            "                \"fulfillment_service\": \"manual\"," +
            "                \"applied_discounts\": []" +
            "            }]," +
            "            \"gift_cards\": []," +
            "            \"shipping_rate\": null," +
            "            \"shipping_address\": {" +
            "                \"id\": 3479863366," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"credit_card\": null," +
            "            \"billing_address\": {" +
            "                \"id\": 3479863302," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"discount\": null" +
            "        }" +
            "    }," +
            "    \"code\": 201," +
            "    \"message\": \"Created\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify17 =
            "{" +
            "    \"body\": {" +
            "        \"errors\": {" +
            "            \"gift_card\": {" +
            "                \"code\": [{" +
            "                    \"code\": \"gift_card_code_invalid\"," +
            "                    \"message\": \"Code is invalid\"," +
            "                    \"options\": {}" +
            "                }]" +
            "            }" +
            "        }" +
            "    }," +
            "    \"code\": 422," +
            "    \"message\": \"Unprocessable Entity\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify18 =
            "{" +
            "    \"body\": {" +
            "        \"product_publications\": [{" +
            "            \"id\": 2626498435," +
            "            \"product_id\": 2096063363," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"updated_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"body_html\": \"parsing the driver won't do anything, we need to calculate the online PNG program!\"," +
            "            \"handle\": \"actinian-fur-hat\"," +
            "            \"product_type\": \"enable bricks-and-clicks e-business\"," +
            "            \"title\": \"Actinian Fur Hat\"," +
            "            \"vendor\": \"McCullough Group\"," +
            "            \"published_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"\"," +
            "            \"images\": [{" +
            "                \"id\": 4277333187," +
            "                \"created_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"position\": 1," +
            "                \"updated_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"product_id\": 2096063363," +
            "                \"src\": \"https:\\\\/\\\\/cdn.shopify.com\\\\/s\\\\/files\\\\/1\\\\/0957\\\\/5792\\\\/products\\\\/Kraepelin3.gif?v=1439489564\"," +
            "                \"variant_ids\": []" +
            "            }]," +
            "            \"options\": [{" +
            "                \"id\": 2524801731," +
            "                \"name\": \"Color or something\"," +
            "                \"product_id\": 2096063363," +
            "                \"position\": 1" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 6030700419," +
            "                \"title\": \"Teal\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2524801731," +
            "                    \"name\": \"Color or something\"," +
            "                    \"value\": \"Teal\"" +
            "                }]," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 4000," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": false," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }]" +
            "        }]" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify19 =
            "{" +
            "    \"body\": {" +
            "        \"checkout\": {" +
            "            \"created_at\": \"2016-03-07T10:20:49-05:00\"," +
            "            \"currency\": \"CAD\"," +
            "            \"customer_id\": 1137418883," +
            "            \"email\": \"test@test.com\"," +
            "            \"location_id\": null," +
            "            \"order_id\": null," +
            "            \"requires_shipping\": true," +
            "            \"reservation_time\": 300," +
            "            \"source_name\": \"mobile_app\"," +
            "            \"source_identifier\": \"26915715\"," +
            "            \"source_url\": null," +
            "            \"taxes_included\": false," +
            "            \"token\": \"ce61868835e4fe131d56c3d5b80dfe15\"," +
            "            \"updated_at\": \"2016-03-07T10:20:49-05:00\"," +
            "            \"payment_due\": \"2230.99\"," +
            "            \"payment_url\": \"https:\\\\/\\\\/elb.deposit.shopifycs.com\\\\/sessions\"," +
            "            \"reservation_time_left\": 299," +
            "            \"subtotal_price\": \"2230.99\"," +
            "            \"total_price\": \"2230.99\"," +
            "            \"total_tax\": \"0.00\"," +
            "            \"attributes\": []," +
            "            \"note\": \"\"," +
            "            \"order\": null," +
            "            \"order_status_url\": null," +
            "            \"privacy_policy_url\": null," +
            "            \"refund_policy_url\": null," +
            "            \"terms_of_service_url\": null," +
            "            \"user_id\": null," +
            "            \"web_url\": \"https:\\\\/\\\\/checkout.shopify.com\\\\/9575792\\\\/checkouts\\\\/ce61868835e4fe131d56c3d5b80dfe15\"," +
            "            \"tax_lines\": []," +
            "            \"line_items\": [{" +
            "                \"id\": \"8f058e451037c916\"," +
            "                \"product_id\": 2096063363," +
            "                \"variant_id\": 6030700419," +
            "                \"sku\": \"\"," +
            "                \"vendor\": \"McCullough Group\"," +
            "                \"title\": \"Actinian Fur Hat\"," +
            "                \"variant_title\": \"Teal\"," +
            "                \"taxable\": false," +
            "                \"requires_shipping\": true," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"line_price\": \"2230.99\"," +
            "                \"properties\": {" +
            "                    \"size\": \"large\"," +
            "                    \"color\": \"red\"" +
            "                }," +
            "                \"quantity\": 1," +
            "                \"grams\": 4000," +
            "                \"fulfillment_service\": \"manual\"," +
            "                \"applied_discounts\": []" +
            "            }]," +
            "            \"gift_cards\": []," +
            "            \"shipping_rate\": null," +
            "            \"shipping_address\": {" +
            "                \"id\": 3479863558," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"credit_card\": null," +
            "            \"billing_address\": {" +
            "                \"id\": 3479863494," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"discount\": null" +
            "        }" +
            "    }," +
            "    \"code\": 201," +
            "    \"message\": \"Created\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify20 =
            "{" +
            "    \"body\": {" +
            "        \"gift_card\": {" +
            "            \"id\": 9740934," +
            "            \"last_characters\": \"rd11\"," +
            "            \"balance\": \"11.00\"," +
            "            \"amount_used\": \"11.00\"," +
            "            \"checkout\": {" +
            "                \"payment_due\": \"2219.99\"" +
            "            }" +
            "        }" +
            "    }," +
            "    \"code\": 201," +
            "    \"message\": \"Created\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify21 =
            "{" +
            "    \"body\": {" +
            "        \"gift_card\": {" +
            "            \"id\": 9740998," +
            "            \"last_characters\": \"rd25\"," +
            "            \"balance\": \"25.00\"," +
            "            \"amount_used\": \"25.00\"," +
            "            \"checkout\": {" +
            "                \"payment_due\": \"2194.99\"" +
            "            }" +
            "        }" +
            "    }," +
            "    \"code\": 201," +
            "    \"message\": \"Created\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify22 =
            "{" +
            "    \"body\": {" +
            "        \"gift_card\": {" +
            "            \"id\": 9741062," +
            "            \"last_characters\": \"rd50\"," +
            "            \"balance\": \"50.00\"," +
            "            \"amount_used\": \"50.00\"," +
            "            \"checkout\": {" +
            "                \"payment_due\": \"2144.99\"" +
            "            }" +
            "        }" +
            "    }," +
            "    \"code\": 201," +
            "    \"message\": \"Created\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify23 =
            "{" +
            "    \"body\": {" +
            "        \"product_publications\": [{" +
            "            \"id\": 2626498435," +
            "            \"product_id\": 2096063363," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"updated_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"body_html\": \"parsing the driver won't do anything, we need to calculate the online PNG program!\"," +
            "            \"handle\": \"actinian-fur-hat\"," +
            "            \"product_type\": \"enable bricks-and-clicks e-business\"," +
            "            \"title\": \"Actinian Fur Hat\"," +
            "            \"vendor\": \"McCullough Group\"," +
            "            \"published_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"\"," +
            "            \"images\": [{" +
            "                \"id\": 4277333187," +
            "                \"created_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"position\": 1," +
            "                \"updated_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"product_id\": 2096063363," +
            "                \"src\": \"https:\\\\/\\\\/cdn.shopify.com\\\\/s\\\\/files\\\\/1\\\\/0957\\\\/5792\\\\/products\\\\/Kraepelin3.gif?v=1439489564\"," +
            "                \"variant_ids\": []" +
            "            }]," +
            "            \"options\": [{" +
            "                \"id\": 2524801731," +
            "                \"name\": \"Color or something\"," +
            "                \"product_id\": 2096063363," +
            "                \"position\": 1" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 6030700419," +
            "                \"title\": \"Teal\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2524801731," +
            "                    \"name\": \"Color or something\"," +
            "                    \"value\": \"Teal\"" +
            "                }]," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 4000," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": false," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }]" +
            "        }]" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify24 =
            "{" +
            "    \"body\": {" +
            "        \"checkout\": {" +
            "            \"created_at\": \"2016-03-07T10:20:51-05:00\"," +
            "            \"currency\": \"CAD\"," +
            "            \"customer_id\": 1137418883," +
            "            \"email\": \"test@test.com\"," +
            "            \"location_id\": null," +
            "            \"order_id\": null," +
            "            \"requires_shipping\": true," +
            "            \"reservation_time\": 300," +
            "            \"source_name\": \"mobile_app\"," +
            "            \"source_identifier\": \"26915715\"," +
            "            \"source_url\": null," +
            "            \"taxes_included\": false," +
            "            \"token\": \"5cf2eb0469fb11ff93316463452da3ff\"," +
            "            \"updated_at\": \"2016-03-07T10:20:51-05:00\"," +
            "            \"payment_due\": \"2230.99\"," +
            "            \"payment_url\": \"https:\\\\/\\\\/elb.deposit.shopifycs.com\\\\/sessions\"," +
            "            \"reservation_time_left\": 299," +
            "            \"subtotal_price\": \"2230.99\"," +
            "            \"total_price\": \"2230.99\"," +
            "            \"total_tax\": \"0.00\"," +
            "            \"attributes\": []," +
            "            \"note\": \"\"," +
            "            \"order\": null," +
            "            \"order_status_url\": null," +
            "            \"privacy_policy_url\": null," +
            "            \"refund_policy_url\": null," +
            "            \"terms_of_service_url\": null," +
            "            \"user_id\": null," +
            "            \"web_url\": \"https:\\\\/\\\\/checkout.shopify.com\\\\/9575792\\\\/checkouts\\\\/5cf2eb0469fb11ff93316463452da3ff\"," +
            "            \"tax_lines\": []," +
            "            \"line_items\": [{" +
            "                \"id\": \"97c849b9eee61474\"," +
            "                \"product_id\": 2096063363," +
            "                \"variant_id\": 6030700419," +
            "                \"sku\": \"\"," +
            "                \"vendor\": \"McCullough Group\"," +
            "                \"title\": \"Actinian Fur Hat\"," +
            "                \"variant_title\": \"Teal\"," +
            "                \"taxable\": false," +
            "                \"requires_shipping\": true," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"line_price\": \"2230.99\"," +
            "                \"properties\": {" +
            "                    \"size\": \"large\"," +
            "                    \"color\": \"red\"" +
            "                }," +
            "                \"quantity\": 1," +
            "                \"grams\": 4000," +
            "                \"fulfillment_service\": \"manual\"," +
            "                \"applied_discounts\": []" +
            "            }]," +
            "            \"gift_cards\": []," +
            "            \"shipping_rate\": null," +
            "            \"shipping_address\": {" +
            "                \"id\": 3479863814," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"credit_card\": null," +
            "            \"billing_address\": {" +
            "                \"id\": 3479863750," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"discount\": null" +
            "        }" +
            "    }," +
            "    \"code\": 201," +
            "    \"message\": \"Created\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify25 =
            "{" +
            "    \"body\": {" +
            "        \"gift_card\": {" +
            "            \"id\": 9741126," +
            "            \"last_characters\": \"rd11\"," +
            "            \"balance\": \"11.00\"," +
            "            \"amount_used\": \"11.00\"," +
            "            \"checkout\": {" +
            "                \"payment_due\": \"2219.99\"" +
            "            }" +
            "        }" +
            "    }," +
            "    \"code\": 201," +
            "    \"message\": \"Created\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify26 =
            "{" +
            "    \"body\": {" +
            "        \"gift_card\": {" +
            "            \"id\": 9741190," +
            "            \"last_characters\": \"rd25\"," +
            "            \"balance\": \"25.00\"," +
            "            \"amount_used\": \"25.00\"," +
            "            \"checkout\": {" +
            "                \"payment_due\": \"2194.99\"" +
            "            }" +
            "        }" +
            "    }," +
            "    \"code\": 201," +
            "    \"message\": \"Created\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify27 =
            "{" +
            "    \"body\": {" +
            "        \"product_publications\": [{" +
            "            \"id\": 2626498435," +
            "            \"product_id\": 2096063363," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"updated_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"body_html\": \"parsing the driver won't do anything, we need to calculate the online PNG program!\"," +
            "            \"handle\": \"actinian-fur-hat\"," +
            "            \"product_type\": \"enable bricks-and-clicks e-business\"," +
            "            \"title\": \"Actinian Fur Hat\"," +
            "            \"vendor\": \"McCullough Group\"," +
            "            \"published_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"\"," +
            "            \"images\": [{" +
            "                \"id\": 4277333187," +
            "                \"created_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"position\": 1," +
            "                \"updated_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"product_id\": 2096063363," +
            "                \"src\": \"https:\\\\/\\\\/cdn.shopify.com\\\\/s\\\\/files\\\\/1\\\\/0957\\\\/5792\\\\/products\\\\/Kraepelin3.gif?v=1439489564\"," +
            "                \"variant_ids\": []" +
            "            }]," +
            "            \"options\": [{" +
            "                \"id\": 2524801731," +
            "                \"name\": \"Color or something\"," +
            "                \"product_id\": 2096063363," +
            "                \"position\": 1" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 6030700419," +
            "                \"title\": \"Teal\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2524801731," +
            "                    \"name\": \"Color or something\"," +
            "                    \"value\": \"Teal\"" +
            "                }]," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 4000," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": false," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }]" +
            "        }]" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify28 =
            "{" +
            "    \"body\": {" +
            "        \"checkout\": {" +
            "            \"created_at\": \"2016-03-07T10:20:52-05:00\"," +
            "            \"currency\": \"CAD\"," +
            "            \"customer_id\": 1137418883," +
            "            \"email\": \"test@test.com\"," +
            "            \"location_id\": null," +
            "            \"order_id\": null," +
            "            \"requires_shipping\": true," +
            "            \"reservation_time\": 300," +
            "            \"source_name\": \"mobile_app\"," +
            "            \"source_identifier\": \"26915715\"," +
            "            \"source_url\": null," +
            "            \"taxes_included\": false," +
            "            \"token\": \"39988ee167f982a5299cc96ad4f692de\"," +
            "            \"updated_at\": \"2016-03-07T10:20:52-05:00\"," +
            "            \"payment_due\": \"2230.99\"," +
            "            \"payment_url\": \"https:\\\\/\\\\/elb.deposit.shopifycs.com\\\\/sessions\"," +
            "            \"reservation_time_left\": 300," +
            "            \"subtotal_price\": \"2230.99\"," +
            "            \"total_price\": \"2230.99\"," +
            "            \"total_tax\": \"0.00\"," +
            "            \"attributes\": []," +
            "            \"note\": \"\"," +
            "            \"order\": null," +
            "            \"order_status_url\": null," +
            "            \"privacy_policy_url\": null," +
            "            \"refund_policy_url\": null," +
            "            \"terms_of_service_url\": null," +
            "            \"user_id\": null," +
            "            \"web_url\": \"https:\\\\/\\\\/checkout.shopify.com\\\\/9575792\\\\/checkouts\\\\/39988ee167f982a5299cc96ad4f692de\"," +
            "            \"tax_lines\": []," +
            "            \"line_items\": [{" +
            "                \"id\": \"06440434c9109166\"," +
            "                \"product_id\": 2096063363," +
            "                \"variant_id\": 6030700419," +
            "                \"sku\": \"\"," +
            "                \"vendor\": \"McCullough Group\"," +
            "                \"title\": \"Actinian Fur Hat\"," +
            "                \"variant_title\": \"Teal\"," +
            "                \"taxable\": false," +
            "                \"requires_shipping\": true," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"line_price\": \"2230.99\"," +
            "                \"properties\": {" +
            "                    \"size\": \"large\"," +
            "                    \"color\": \"red\"" +
            "                }," +
            "                \"quantity\": 1," +
            "                \"grams\": 4000," +
            "                \"fulfillment_service\": \"manual\"," +
            "                \"applied_discounts\": []" +
            "            }]," +
            "            \"gift_cards\": []," +
            "            \"shipping_rate\": null," +
            "            \"shipping_address\": {" +
            "                \"id\": 3479863942," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"credit_card\": null," +
            "            \"billing_address\": {" +
            "                \"id\": 3479863878," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"discount\": null" +
            "        }" +
            "    }," +
            "    \"code\": 201," +
            "    \"message\": \"Created\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify29 =
            "{" +
            "    \"body\": {" +
            "        \"shipping_rates\": [{" +
            "            \"id\": \"shopify-Standard%20Shipping-8.00\"," +
            "            \"price\": \"8.00\"," +
            "            \"title\": \"Standard Shipping\"," +
            "            \"checkout\": {" +
            "                \"total_tax\": \"0.00\"," +
            "                \"total_price\": \"2238.99\"," +
            "                \"subtotal_price\": \"2230.99\"" +
            "            }," +
            "            \"phone_required\": false," +
            "            \"delivery_range\": null" +
            "        }]" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify30 =
            "{" +
            "    \"body\": {" +
            "        \"checkout\": {" +
            "            \"created_at\": \"2016-03-07T10:20:52-05:00\"," +
            "            \"currency\": \"CAD\"," +
            "            \"customer_id\": 1137418883," +
            "            \"email\": \"test@test.com\"," +
            "            \"location_id\": null," +
            "            \"order_id\": null," +
            "            \"requires_shipping\": true," +
            "            \"reservation_time\": 300," +
            "            \"source_name\": \"mobile_app\"," +
            "            \"source_identifier\": \"26915715\"," +
            "            \"source_url\": null," +
            "            \"taxes_included\": false," +
            "            \"token\": \"39988ee167f982a5299cc96ad4f692de\"," +
            "            \"updated_at\": \"2016-03-07T10:20:53-05:00\"," +
            "            \"payment_due\": \"2238.99\"," +
            "            \"payment_url\": \"https:\\\\/\\\\/elb.deposit.shopifycs.com\\\\/sessions\"," +
            "            \"reservation_time_left\": 300," +
            "            \"subtotal_price\": \"2230.99\"," +
            "            \"total_price\": \"2238.99\"," +
            "            \"total_tax\": \"0.00\"," +
            "            \"attributes\": []," +
            "            \"note\": \"\"," +
            "            \"order\": null," +
            "            \"order_status_url\": null," +
            "            \"privacy_policy_url\": null," +
            "            \"refund_policy_url\": null," +
            "            \"terms_of_service_url\": null," +
            "            \"user_id\": null," +
            "            \"web_url\": \"https:\\\\/\\\\/checkout.shopify.com\\\\/9575792\\\\/checkouts\\\\/39988ee167f982a5299cc96ad4f692de\"," +
            "            \"tax_lines\": []," +
            "            \"line_items\": [{" +
            "                \"id\": \"f996d27e83a20d6f\"," +
            "                \"product_id\": 2096063363," +
            "                \"variant_id\": 6030700419," +
            "                \"sku\": \"\"," +
            "                \"vendor\": \"McCullough Group\"," +
            "                \"title\": \"Actinian Fur Hat\"," +
            "                \"variant_title\": \"Teal\"," +
            "                \"taxable\": false," +
            "                \"requires_shipping\": true," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"line_price\": \"2230.99\"," +
            "                \"properties\": {" +
            "                    \"size\": \"large\"," +
            "                    \"color\": \"red\"" +
            "                }," +
            "                \"quantity\": 1," +
            "                \"grams\": 4000," +
            "                \"fulfillment_service\": \"manual\"," +
            "                \"applied_discounts\": []" +
            "            }]," +
            "            \"gift_cards\": []," +
            "            \"shipping_rate\": {" +
            "                \"id\": \"shopify-Standard%20Shipping-8.00\"," +
            "                \"price\": \"8.00\"," +
            "                \"title\": \"Standard Shipping\"" +
            "            }," +
            "            \"shipping_address\": {" +
            "                \"id\": 3479863942," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"credit_card\": null," +
            "            \"billing_address\": {" +
            "                \"id\": 3479863878," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"discount\": null" +
            "        }" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify31 =
            "{" +
            "    \"body\": {" +
            "        \"checkout\": {" +
            "            \"created_at\": \"2016-03-07T10:20:52-05:00\"," +
            "            \"currency\": \"CAD\"," +
            "            \"customer_id\": 1137418883," +
            "            \"email\": \"test@test.com\"," +
            "            \"location_id\": null," +
            "            \"order_id\": null," +
            "            \"requires_shipping\": true," +
            "            \"reservation_time\": 300," +
            "            \"source_name\": \"mobile_app\"," +
            "            \"source_identifier\": \"26915715\"," +
            "            \"source_url\": null," +
            "            \"taxes_included\": false," +
            "            \"token\": \"39988ee167f982a5299cc96ad4f692de\"," +
            "            \"updated_at\": \"2016-03-07T10:20:54-05:00\"," +
            "            \"payment_due\": \"2230.99\"," +
            "            \"payment_url\": \"https:\\\\/\\\\/elb.deposit.shopifycs.com\\\\/sessions\"," +
            "            \"reservation_time_left\": 300," +
            "            \"subtotal_price\": \"2230.99\"," +
            "            \"total_price\": \"2230.99\"," +
            "            \"total_tax\": \"0.00\"," +
            "            \"attributes\": []," +
            "            \"note\": \"\"," +
            "            \"order\": null," +
            "            \"order_status_url\": null," +
            "            \"privacy_policy_url\": null," +
            "            \"refund_policy_url\": null," +
            "            \"terms_of_service_url\": null," +
            "            \"user_id\": null," +
            "            \"web_url\": \"https:\\\\/\\\\/checkout.shopify.com\\\\/9575792\\\\/checkouts\\\\/39988ee167f982a5299cc96ad4f692de\"," +
            "            \"tax_lines\": []," +
            "            \"line_items\": [{" +
            "                \"id\": \"407e1ac22350d035\"," +
            "                \"product_id\": 2096063363," +
            "                \"variant_id\": 6030700419," +
            "                \"sku\": \"\"," +
            "                \"vendor\": \"McCullough Group\"," +
            "                \"title\": \"Actinian Fur Hat\"," +
            "                \"variant_title\": \"Teal\"," +
            "                \"taxable\": false," +
            "                \"requires_shipping\": true," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"line_price\": \"2230.99\"," +
            "                \"properties\": {" +
            "                    \"size\": \"large\"," +
            "                    \"color\": \"red\"" +
            "                }," +
            "                \"quantity\": 1," +
            "                \"grams\": 4000," +
            "                \"fulfillment_service\": \"manual\"," +
            "                \"applied_discounts\": []" +
            "            }]," +
            "            \"gift_cards\": []," +
            "            \"shipping_rate\": null," +
            "            \"shipping_address\": {" +
            "                \"id\": 3479863942," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Toronto\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"credit_card\": null," +
            "            \"billing_address\": {" +
            "                \"id\": 3479863878," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"discount\": null" +
            "        }" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify32 =
            "{" +
            "    \"body\": {" +
            "        \"shipping_rates\": [{" +
            "            \"id\": \"shopify-Standard%20Shipping-8.00\"," +
            "            \"price\": \"8.00\"," +
            "            \"title\": \"Standard Shipping\"," +
            "            \"checkout\": {" +
            "                \"total_tax\": \"0.00\"," +
            "                \"total_price\": \"2238.99\"," +
            "                \"subtotal_price\": \"2230.99\"" +
            "            }," +
            "            \"phone_required\": false," +
            "            \"delivery_range\": null" +
            "        }]" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify33 =
            "{" +
            "    \"body\": {" +
            "        \"checkout\": {" +
            "            \"created_at\": \"2016-03-07T10:20:52-05:00\"," +
            "            \"currency\": \"CAD\"," +
            "            \"customer_id\": 1137418883," +
            "            \"email\": \"test@test.com\"," +
            "            \"location_id\": null," +
            "            \"order_id\": null," +
            "            \"requires_shipping\": true," +
            "            \"reservation_time\": 300," +
            "            \"source_name\": \"mobile_app\"," +
            "            \"source_identifier\": \"26915715\"," +
            "            \"source_url\": null," +
            "            \"taxes_included\": false," +
            "            \"token\": \"39988ee167f982a5299cc96ad4f692de\"," +
            "            \"updated_at\": \"2016-03-07T10:20:55-05:00\"," +
            "            \"payment_due\": \"2238.99\"," +
            "            \"payment_url\": \"https:\\\\/\\\\/elb.deposit.shopifycs.com\\\\/sessions\"," +
            "            \"reservation_time_left\": 300," +
            "            \"subtotal_price\": \"2230.99\"," +
            "            \"total_price\": \"2238.99\"," +
            "            \"total_tax\": \"0.00\"," +
            "            \"attributes\": []," +
            "            \"note\": \"\"," +
            "            \"order\": null," +
            "            \"order_status_url\": null," +
            "            \"privacy_policy_url\": null," +
            "            \"refund_policy_url\": null," +
            "            \"terms_of_service_url\": null," +
            "            \"user_id\": null," +
            "            \"web_url\": \"https:\\\\/\\\\/checkout.shopify.com\\\\/9575792\\\\/checkouts\\\\/39988ee167f982a5299cc96ad4f692de\"," +
            "            \"tax_lines\": []," +
            "            \"line_items\": [{" +
            "                \"id\": \"0244bebe02b83abe\"," +
            "                \"product_id\": 2096063363," +
            "                \"variant_id\": 6030700419," +
            "                \"sku\": \"\"," +
            "                \"vendor\": \"McCullough Group\"," +
            "                \"title\": \"Actinian Fur Hat\"," +
            "                \"variant_title\": \"Teal\"," +
            "                \"taxable\": false," +
            "                \"requires_shipping\": true," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"line_price\": \"2230.99\"," +
            "                \"properties\": {" +
            "                    \"size\": \"large\"," +
            "                    \"color\": \"red\"" +
            "                }," +
            "                \"quantity\": 1," +
            "                \"grams\": 4000," +
            "                \"fulfillment_service\": \"manual\"," +
            "                \"applied_discounts\": []" +
            "            }]," +
            "            \"gift_cards\": []," +
            "            \"shipping_rate\": {" +
            "                \"id\": \"shopify-Standard%20Shipping-8.00\"," +
            "                \"price\": \"8.00\"," +
            "                \"title\": \"Standard Shipping\"" +
            "            }," +
            "            \"shipping_address\": {" +
            "                \"id\": 3479863942," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Toronto\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"credit_card\": null," +
            "            \"billing_address\": {" +
            "                \"id\": 3479863878," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"discount\": null" +
            "        }" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify34 =
            "{" +
            "    \"body\": {" +
            "        \"product_publications\": [{" +
            "            \"id\": 2626498435," +
            "            \"product_id\": 2096063363," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"updated_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"body_html\": \"parsing the driver won't do anything, we need to calculate the online PNG program!\"," +
            "            \"handle\": \"actinian-fur-hat\"," +
            "            \"product_type\": \"enable bricks-and-clicks e-business\"," +
            "            \"title\": \"Actinian Fur Hat\"," +
            "            \"vendor\": \"McCullough Group\"," +
            "            \"published_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"\"," +
            "            \"images\": [{" +
            "                \"id\": 4277333187," +
            "                \"created_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"position\": 1," +
            "                \"updated_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"product_id\": 2096063363," +
            "                \"src\": \"https:\\\\/\\\\/cdn.shopify.com\\\\/s\\\\/files\\\\/1\\\\/0957\\\\/5792\\\\/products\\\\/Kraepelin3.gif?v=1439489564\"," +
            "                \"variant_ids\": []" +
            "            }]," +
            "            \"options\": [{" +
            "                \"id\": 2524801731," +
            "                \"name\": \"Color or something\"," +
            "                \"product_id\": 2096063363," +
            "                \"position\": 1" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 6030700419," +
            "                \"title\": \"Teal\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2524801731," +
            "                    \"name\": \"Color or something\"," +
            "                    \"value\": \"Teal\"" +
            "                }]," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 4000," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": false," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }]" +
            "        }]" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify35 =
            "{" +
            "    \"body\": {" +
            "        \"checkout\": {" +
            "            \"created_at\": \"2016-03-07T10:20:56-05:00\"," +
            "            \"currency\": \"CAD\"," +
            "            \"customer_id\": 1137418883," +
            "            \"email\": \"test@test.com\"," +
            "            \"location_id\": null," +
            "            \"order_id\": null," +
            "            \"requires_shipping\": true," +
            "            \"reservation_time\": 300," +
            "            \"source_name\": \"mobile_app\"," +
            "            \"source_identifier\": \"26915715\"," +
            "            \"source_url\": null," +
            "            \"taxes_included\": false," +
            "            \"token\": \"4bd92a3e9ab0b3adf790e0774db6c815\"," +
            "            \"updated_at\": \"2016-03-07T10:20:56-05:00\"," +
            "            \"payment_due\": \"2230.99\"," +
            "            \"payment_url\": \"https:\\\\/\\\\/elb.deposit.shopifycs.com\\\\/sessions\"," +
            "            \"reservation_time_left\": 300," +
            "            \"subtotal_price\": \"2230.99\"," +
            "            \"total_price\": \"2230.99\"," +
            "            \"total_tax\": \"0.00\"," +
            "            \"attributes\": []," +
            "            \"note\": \"\"," +
            "            \"order\": null," +
            "            \"order_status_url\": null," +
            "            \"privacy_policy_url\": null," +
            "            \"refund_policy_url\": null," +
            "            \"terms_of_service_url\": null," +
            "            \"user_id\": null," +
            "            \"web_url\": \"https:\\\\/\\\\/checkout.shopify.com\\\\/9575792\\\\/checkouts\\\\/4bd92a3e9ab0b3adf790e0774db6c815\"," +
            "            \"tax_lines\": []," +
            "            \"line_items\": [{" +
            "                \"id\": \"82a8a49460b69cf3\"," +
            "                \"product_id\": 2096063363," +
            "                \"variant_id\": 6030700419," +
            "                \"sku\": \"\"," +
            "                \"vendor\": \"McCullough Group\"," +
            "                \"title\": \"Actinian Fur Hat\"," +
            "                \"variant_title\": \"Teal\"," +
            "                \"taxable\": false," +
            "                \"requires_shipping\": true," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"line_price\": \"2230.99\"," +
            "                \"properties\": {" +
            "                    \"size\": \"large\"," +
            "                    \"color\": \"red\"" +
            "                }," +
            "                \"quantity\": 1," +
            "                \"grams\": 4000," +
            "                \"fulfillment_service\": \"manual\"," +
            "                \"applied_discounts\": []" +
            "            }]," +
            "            \"gift_cards\": []," +
            "            \"shipping_rate\": null," +
            "            \"shipping_address\": {" +
            "                \"id\": 3479864454," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"credit_card\": null," +
            "            \"billing_address\": {" +
            "                \"id\": 3479864390," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"discount\": null" +
            "        }" +
            "    }," +
            "    \"code\": 201," +
            "    \"message\": \"Created\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify36 =
            "{" +
            "    \"body\": {" +
            "        \"shipping_rates\": [{" +
            "            \"id\": \"shopify-Standard%20Shipping-8.00\"," +
            "            \"price\": \"8.00\"," +
            "            \"title\": \"Standard Shipping\"," +
            "            \"checkout\": {" +
            "                \"total_tax\": \"0.00\"," +
            "                \"total_price\": \"2238.99\"," +
            "                \"subtotal_price\": \"2230.99\"" +
            "            }," +
            "            \"phone_required\": false," +
            "            \"delivery_range\": null" +
            "        }]" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify37 =
            "{" +
            "    \"body\": {" +
            "        \"checkout\": {" +
            "            \"created_at\": \"2016-03-07T10:20:56-05:00\"," +
            "            \"currency\": \"CAD\"," +
            "            \"customer_id\": 1137418883," +
            "            \"email\": \"test@test.com\"," +
            "            \"location_id\": null," +
            "            \"order_id\": null," +
            "            \"requires_shipping\": true," +
            "            \"reservation_time\": 300," +
            "            \"source_name\": \"mobile_app\"," +
            "            \"source_identifier\": \"26915715\"," +
            "            \"source_url\": null," +
            "            \"taxes_included\": false," +
            "            \"token\": \"4bd92a3e9ab0b3adf790e0774db6c815\"," +
            "            \"updated_at\": \"2016-03-07T10:20:57-05:00\"," +
            "            \"payment_due\": \"2238.99\"," +
            "            \"payment_url\": \"https:\\\\/\\\\/elb.deposit.shopifycs.com\\\\/sessions\"," +
            "            \"reservation_time_left\": 300," +
            "            \"subtotal_price\": \"2230.99\"," +
            "            \"total_price\": \"2238.99\"," +
            "            \"total_tax\": \"0.00\"," +
            "            \"attributes\": []," +
            "            \"note\": \"\"," +
            "            \"order\": null," +
            "            \"order_status_url\": null," +
            "            \"privacy_policy_url\": null," +
            "            \"refund_policy_url\": null," +
            "            \"terms_of_service_url\": null," +
            "            \"user_id\": null," +
            "            \"web_url\": \"https:\\\\/\\\\/checkout.shopify.com\\\\/9575792\\\\/checkouts\\\\/4bd92a3e9ab0b3adf790e0774db6c815\"," +
            "            \"tax_lines\": []," +
            "            \"line_items\": [{" +
            "                \"id\": \"cfdc9344bacf009e\"," +
            "                \"product_id\": 2096063363," +
            "                \"variant_id\": 6030700419," +
            "                \"sku\": \"\"," +
            "                \"vendor\": \"McCullough Group\"," +
            "                \"title\": \"Actinian Fur Hat\"," +
            "                \"variant_title\": \"Teal\"," +
            "                \"taxable\": false," +
            "                \"requires_shipping\": true," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"line_price\": \"2230.99\"," +
            "                \"properties\": {" +
            "                    \"size\": \"large\"," +
            "                    \"color\": \"red\"" +
            "                }," +
            "                \"quantity\": 1," +
            "                \"grams\": 4000," +
            "                \"fulfillment_service\": \"manual\"," +
            "                \"applied_discounts\": []" +
            "            }]," +
            "            \"gift_cards\": []," +
            "            \"shipping_rate\": {" +
            "                \"id\": \"shopify-Standard%20Shipping-8.00\"," +
            "                \"price\": \"8.00\"," +
            "                \"title\": \"Standard Shipping\"" +
            "            }," +
            "            \"shipping_address\": {" +
            "                \"id\": 3479864454," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"credit_card\": null," +
            "            \"billing_address\": {" +
            "                \"id\": 3479864390," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"discount\": null" +
            "        }" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify38 =
            "{" +
            "    \"body\": {" +
            "        \"id\": \"west-6e4f578272359fe593c24c473c9d077b\"" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify39 =
            "{" +
            "    \"body\": {" +
            "        \"checkout\": {" +
            "            \"created_at\": \"2016-03-07T10:20:56-05:00\"," +
            "            \"currency\": \"CAD\"," +
            "            \"customer_id\": 1137418883," +
            "            \"email\": \"test@test.com\"," +
            "            \"location_id\": null," +
            "            \"order_id\": null," +
            "            \"requires_shipping\": true," +
            "            \"reservation_time\": 300," +
            "            \"source_name\": \"mobile_app\"," +
            "            \"source_identifier\": \"26915715\"," +
            "            \"source_url\": null," +
            "            \"taxes_included\": false," +
            "            \"token\": \"4bd92a3e9ab0b3adf790e0774db6c815\"," +
            "            \"updated_at\": \"2016-03-07T10:20:58-05:00\"," +
            "            \"payment_due\": \"2238.99\"," +
            "            \"payment_url\": \"https:\\\\/\\\\/elb.deposit.shopifycs.com\\\\/sessions\"," +
            "            \"reservation_time_left\": 3600," +
            "            \"subtotal_price\": \"2230.99\"," +
            "            \"total_price\": \"2238.99\"," +
            "            \"total_tax\": \"0.00\"," +
            "            \"attributes\": []," +
            "            \"note\": \"\"," +
            "            \"order\": null," +
            "            \"order_status_url\": null," +
            "            \"privacy_policy_url\": null," +
            "            \"refund_policy_url\": null," +
            "            \"terms_of_service_url\": null," +
            "            \"user_id\": null," +
            "            \"web_url\": \"https:\\\\/\\\\/checkout.shopify.com\\\\/9575792\\\\/checkouts\\\\/4bd92a3e9ab0b3adf790e0774db6c815\"," +
            "            \"tax_lines\": []," +
            "            \"line_items\": [{" +
            "                \"id\": \"cfdc9344bacf009e\"," +
            "                \"product_id\": 2096063363," +
            "                \"variant_id\": 6030700419," +
            "                \"sku\": \"\"," +
            "                \"vendor\": \"McCullough Group\"," +
            "                \"title\": \"Actinian Fur Hat\"," +
            "                \"variant_title\": \"Teal\"," +
            "                \"taxable\": false," +
            "                \"requires_shipping\": true," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"line_price\": \"2230.99\"," +
            "                \"properties\": {" +
            "                    \"size\": \"large\"," +
            "                    \"color\": \"red\"" +
            "                }," +
            "                \"quantity\": 1," +
            "                \"grams\": 4000," +
            "                \"fulfillment_service\": \"manual\"," +
            "                \"applied_discounts\": []" +
            "            }]," +
            "            \"gift_cards\": []," +
            "            \"shipping_rate\": {" +
            "                \"id\": \"shopify-Standard%20Shipping-8.00\"," +
            "                \"price\": \"8.00\"," +
            "                \"title\": \"Standard Shipping\"" +
            "            }," +
            "            \"shipping_address\": {" +
            "                \"id\": 3479864454," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"credit_card\": {" +
            "                \"first_name\": \"John\"," +
            "                \"last_name\": \"Smith\"," +
            "                \"first_digits\": \"424242\"," +
            "                \"last_digits\": \"4242\"," +
            "                \"expiry_month\": 5," +
            "                \"expiry_year\": 2020" +
            "            }," +
            "            \"billing_address\": {" +
            "                \"id\": 3479864390," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"discount\": null" +
            "        }" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify40 =
            "{" +
            "    \"body\": {}," +
            "    \"code\": 202," +
            "    \"message\": \"Accepted\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify41 =
            "{" +
            "    \"body\": {}," +
            "    \"code\": 202," +
            "    \"message\": \"Accepted\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify42 =
            "{" +
            "    \"body\": {}," +
            "    \"code\": 202," +
            "    \"message\": \"Accepted\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify43 =
            "{" +
            "    \"body\": {}," +
            "    \"code\": 202," +
            "    \"message\": \"Accepted\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify44 =
            "{" +
            "    \"body\": {}," +
            "    \"code\": 202," +
            "    \"message\": \"Accepted\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify45 =
            "{" +
            "    \"body\": {}," +
            "    \"code\": 202," +
            "    \"message\": \"Accepted\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify46 =
            "{" +
            "    \"body\": \"\"," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify47 =
            "{" +
            "    \"body\": {" +
            "        \"checkout\": {" +
            "            \"created_at\": \"2016-03-07T10:20:56-05:00\"," +
            "            \"currency\": \"CAD\"," +
            "            \"customer_id\": 1137418883," +
            "            \"email\": \"test@test.com\"," +
            "            \"location_id\": null," +
            "            \"order_id\": 2548686982," +
            "            \"requires_shipping\": true," +
            "            \"reservation_time\": 300," +
            "            \"source_name\": \"mobile_app\"," +
            "            \"source_identifier\": \"26915715\"," +
            "            \"source_url\": null," +
            "            \"taxes_included\": false," +
            "            \"token\": \"4bd92a3e9ab0b3adf790e0774db6c815\"," +
            "            \"updated_at\": \"2016-03-07T10:21:00-05:00\"," +
            "            \"payment_due\": \"2238.99\"," +
            "            \"payment_url\": \"https:\\\\/\\\\/elb.deposit.shopifycs.com\\\\/sessions\"," +
            "            \"reservation_time_left\": 0," +
            "            \"subtotal_price\": \"2230.99\"," +
            "            \"total_price\": \"2238.99\"," +
            "            \"total_tax\": \"0.00\"," +
            "            \"attributes\": []," +
            "            \"note\": \"\"," +
            "            \"order\": {" +
            "                \"id\": 2548686982," +
            "                \"name\": \"#4269\"," +
            "                \"status_url\": \"https:\\\\/\\\\/checkout.shopify.com\\\\/9575792\\\\/checkouts\\\\/4bd92a3e9ab0b3adf790e0774db6c815\\\\/thank_you\"" +
            "            }," +
            "            \"order_status_url\": \"https:\\\\/\\\\/checkout.shopify.com\\\\/9575792\\\\/checkouts\\\\/4bd92a3e9ab0b3adf790e0774db6c815\\\\/thank_you\"," +
            "            \"privacy_policy_url\": null," +
            "            \"refund_policy_url\": null," +
            "            \"terms_of_service_url\": null," +
            "            \"user_id\": null," +
            "            \"web_url\": \"https:\\\\/\\\\/checkout.shopify.com\\\\/9575792\\\\/checkouts\\\\/4bd92a3e9ab0b3adf790e0774db6c815\"," +
            "            \"tax_lines\": []," +
            "            \"line_items\": [{" +
            "                \"id\": \"cfdc9344bacf009e\"," +
            "                \"product_id\": 2096063363," +
            "                \"variant_id\": 6030700419," +
            "                \"sku\": \"\"," +
            "                \"vendor\": \"McCullough Group\"," +
            "                \"title\": \"Actinian Fur Hat\"," +
            "                \"variant_title\": \"Teal\"," +
            "                \"taxable\": false," +
            "                \"requires_shipping\": true," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"line_price\": \"2230.99\"," +
            "                \"properties\": {" +
            "                    \"size\": \"large\"," +
            "                    \"color\": \"red\"" +
            "                }," +
            "                \"quantity\": 1," +
            "                \"grams\": 4000," +
            "                \"fulfillment_service\": \"manual\"," +
            "                \"applied_discounts\": []" +
            "            }]," +
            "            \"gift_cards\": []," +
            "            \"shipping_rate\": {" +
            "                \"id\": \"shopify-Standard%20Shipping-8.00\"," +
            "                \"price\": \"8.00\"," +
            "                \"title\": \"Standard Shipping\"" +
            "            }," +
            "            \"shipping_address\": {" +
            "                \"id\": 3479864454," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"credit_card\": {" +
            "                \"first_name\": \"John\"," +
            "                \"last_name\": \"Smith\"," +
            "                \"first_digits\": \"424242\"," +
            "                \"last_digits\": \"4242\"," +
            "                \"expiry_month\": 5," +
            "                \"expiry_year\": 2020" +
            "            }," +
            "            \"billing_address\": {" +
            "                \"id\": 3479864390," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"discount\": null" +
            "        }" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify48 =
            "{" +
            "    \"body\": {" +
            "        \"product_publications\": [{" +
            "            \"id\": 2626498435," +
            "            \"product_id\": 2096063363," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"updated_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"body_html\": \"parsing the driver won't do anything, we need to calculate the online PNG program!\"," +
            "            \"handle\": \"actinian-fur-hat\"," +
            "            \"product_type\": \"enable bricks-and-clicks e-business\"," +
            "            \"title\": \"Actinian Fur Hat\"," +
            "            \"vendor\": \"McCullough Group\"," +
            "            \"published_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"\"," +
            "            \"images\": [{" +
            "                \"id\": 4277333187," +
            "                \"created_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"position\": 1," +
            "                \"updated_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"product_id\": 2096063363," +
            "                \"src\": \"https:\\\\/\\\\/cdn.shopify.com\\\\/s\\\\/files\\\\/1\\\\/0957\\\\/5792\\\\/products\\\\/Kraepelin3.gif?v=1439489564\"," +
            "                \"variant_ids\": []" +
            "            }]," +
            "            \"options\": [{" +
            "                \"id\": 2524801731," +
            "                \"name\": \"Color or something\"," +
            "                \"product_id\": 2096063363," +
            "                \"position\": 1" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 6030700419," +
            "                \"title\": \"Teal\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2524801731," +
            "                    \"name\": \"Color or something\"," +
            "                    \"value\": \"Teal\"" +
            "                }]," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 4000," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": false," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }]" +
            "        }]" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify49 =
            "{" +
            "    \"body\": {" +
            "        \"errors\": {" +
            "            \"checkout\": {" +
            "                \"line_items\": []," +
            "                \"source_name\": []," +
            "                \"reservation_time\": []," +
            "                \"discount\": {" +
            "                    \"amount\": [{" +
            "                        \"code\": \"greater_than\"," +
            "                        \"message\": \"must be greater than 0\"," +
            "                        \"options\": {" +
            "                            \"value\": 0.0," +
            "                            \"count\": 0" +
            "                        }" +
            "                    }]," +
            "                    \"code\": [{" +
            "                        \"code\": \"discount_not_found\"," +
            "                        \"message\": \"Unable to find a valid discount matching the code entered\"," +
            "                        \"options\": {}" +
            "                    }]" +
            "                }" +
            "            }" +
            "        }" +
            "    }," +
            "    \"code\": 422," +
            "    \"message\": \"Unprocessable Entity\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify50 =
            "{" +
            "    \"body\": {" +
            "        \"product_publications\": [{" +
            "            \"id\": 2626498435," +
            "            \"product_id\": 2096063363," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"updated_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"body_html\": \"parsing the driver won't do anything, we need to calculate the online PNG program!\"," +
            "            \"handle\": \"actinian-fur-hat\"," +
            "            \"product_type\": \"enable bricks-and-clicks e-business\"," +
            "            \"title\": \"Actinian Fur Hat\"," +
            "            \"vendor\": \"McCullough Group\"," +
            "            \"published_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"\"," +
            "            \"images\": [{" +
            "                \"id\": 4277333187," +
            "                \"created_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"position\": 1," +
            "                \"updated_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"product_id\": 2096063363," +
            "                \"src\": \"https:\\\\/\\\\/cdn.shopify.com\\\\/s\\\\/files\\\\/1\\\\/0957\\\\/5792\\\\/products\\\\/Kraepelin3.gif?v=1439489564\"," +
            "                \"variant_ids\": []" +
            "            }]," +
            "            \"options\": [{" +
            "                \"id\": 2524801731," +
            "                \"name\": \"Color or something\"," +
            "                \"product_id\": 2096063363," +
            "                \"position\": 1" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 6030700419," +
            "                \"title\": \"Teal\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2524801731," +
            "                    \"name\": \"Color or something\"," +
            "                    \"value\": \"Teal\"" +
            "                }]," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 4000," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": false," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }]" +
            "        }]" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify51 =
            "{" +
            "    \"body\": {" +
            "        \"errors\": {" +
            "            \"checkout\": {" +
            "                \"line_items\": []," +
            "                \"source_name\": []," +
            "                \"reservation_time\": []," +
            "                \"discount\": {" +
            "                    \"amount\": [{" +
            "                        \"code\": \"greater_than\"," +
            "                        \"message\": \"must be greater than 0\"," +
            "                        \"options\": {" +
            "                            \"value\": 0.0," +
            "                            \"count\": 0" +
            "                        }" +
            "                    }]," +
            "                    \"code\": [{" +
            "                        \"code\": \"discount_not_found\"," +
            "                        \"message\": \"Unable to find a valid discount matching the code entered\"," +
            "                        \"options\": {}" +
            "                    }]" +
            "                }" +
            "            }" +
            "        }" +
            "    }," +
            "    \"code\": 422," +
            "    \"message\": \"Unprocessable Entity\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify52 =
            "{" +
            "    \"body\": {" +
            "        \"product_publications\": [{" +
            "            \"id\": 2626498435," +
            "            \"product_id\": 2096063363," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"updated_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"body_html\": \"parsing the driver won't do anything, we need to calculate the online PNG program!\"," +
            "            \"handle\": \"actinian-fur-hat\"," +
            "            \"product_type\": \"enable bricks-and-clicks e-business\"," +
            "            \"title\": \"Actinian Fur Hat\"," +
            "            \"vendor\": \"McCullough Group\"," +
            "            \"published_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"\"," +
            "            \"images\": [{" +
            "                \"id\": 4277333187," +
            "                \"created_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"position\": 1," +
            "                \"updated_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"product_id\": 2096063363," +
            "                \"src\": \"https:\\\\/\\\\/cdn.shopify.com\\\\/s\\\\/files\\\\/1\\\\/0957\\\\/5792\\\\/products\\\\/Kraepelin3.gif?v=1439489564\"," +
            "                \"variant_ids\": []" +
            "            }]," +
            "            \"options\": [{" +
            "                \"id\": 2524801731," +
            "                \"name\": \"Color or something\"," +
            "                \"product_id\": 2096063363," +
            "                \"position\": 1" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 6030700419," +
            "                \"title\": \"Teal\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2524801731," +
            "                    \"name\": \"Color or something\"," +
            "                    \"value\": \"Teal\"" +
            "                }]," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 4000," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": false," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }]" +
            "        }]" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify53 =
            "{" +
            "    \"body\": {" +
            "        \"checkout\": {" +
            "            \"created_at\": \"2016-03-07T10:21:02-05:00\"," +
            "            \"currency\": \"CAD\"," +
            "            \"customer_id\": null," +
            "            \"email\": \"\"," +
            "            \"location_id\": null," +
            "            \"order_id\": null," +
            "            \"requires_shipping\": true," +
            "            \"reservation_time\": 300," +
            "            \"source_name\": \"mobile_app\"," +
            "            \"source_identifier\": \"26915715\"," +
            "            \"source_url\": null," +
            "            \"taxes_included\": false," +
            "            \"token\": \"465533e38b7d3135bc8ca4a712e2edb4\"," +
            "            \"updated_at\": \"2016-03-07T10:21:02-05:00\"," +
            "            \"payment_due\": \"2218.99\"," +
            "            \"payment_url\": \"https:\\\\/\\\\/elb.deposit.shopifycs.com\\\\/sessions\"," +
            "            \"reservation_time_left\": 300," +
            "            \"subtotal_price\": \"2218.99\"," +
            "            \"total_price\": \"2218.99\"," +
            "            \"total_tax\": \"0.00\"," +
            "            \"attributes\": []," +
            "            \"note\": \"\"," +
            "            \"order\": null," +
            "            \"order_status_url\": null," +
            "            \"privacy_policy_url\": null," +
            "            \"refund_policy_url\": null," +
            "            \"terms_of_service_url\": null," +
            "            \"user_id\": null," +
            "            \"web_url\": \"https:\\\\/\\\\/checkout.shopify.com\\\\/9575792\\\\/checkouts\\\\/465533e38b7d3135bc8ca4a712e2edb4\"," +
            "            \"tax_lines\": []," +
            "            \"line_items\": [{" +
            "                \"id\": \"e0dc01d7df1f53e8\"," +
            "                \"product_id\": 2096063363," +
            "                \"variant_id\": 6030700419," +
            "                \"sku\": \"\"," +
            "                \"vendor\": \"McCullough Group\"," +
            "                \"title\": \"Actinian Fur Hat\"," +
            "                \"variant_title\": \"Teal\"," +
            "                \"taxable\": false," +
            "                \"requires_shipping\": true," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"line_price\": \"2230.99\"," +
            "                \"properties\": {" +
            "                    \"size\": \"large\"," +
            "                    \"color\": \"red\"" +
            "                }," +
            "                \"quantity\": 1," +
            "                \"grams\": 4000," +
            "                \"fulfillment_service\": \"manual\"," +
            "                \"applied_discounts\": []" +
            "            }]," +
            "            \"gift_cards\": []," +
            "            \"shipping_rate\": null," +
            "            \"shipping_address\": {" +
            "                \"id\": 3479864582," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"credit_card\": null," +
            "            \"billing_address\": {" +
            "                \"id\": 3479864518," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"discount\": {" +
            "                \"code\": \"12_dollar_discount\"," +
            "                \"amount\": \"12.00\"," +
            "                \"applicable\": true," +
            "                \"reason\": null" +
            "            }" +
            "        }" +
            "    }," +
            "    \"code\": 201," +
            "    \"message\": \"Created\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify54 =
            "{" +
            "    \"body\": {" +
            "        \"product_publications\": [{" +
            "            \"id\": 2626498435," +
            "            \"product_id\": 2096063363," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"updated_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"body_html\": \"parsing the driver won't do anything, we need to calculate the online PNG program!\"," +
            "            \"handle\": \"actinian-fur-hat\"," +
            "            \"product_type\": \"enable bricks-and-clicks e-business\"," +
            "            \"title\": \"Actinian Fur Hat\"," +
            "            \"vendor\": \"McCullough Group\"," +
            "            \"published_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"\"," +
            "            \"images\": [{" +
            "                \"id\": 4277333187," +
            "                \"created_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"position\": 1," +
            "                \"updated_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"product_id\": 2096063363," +
            "                \"src\": \"https:\\\\/\\\\/cdn.shopify.com\\\\/s\\\\/files\\\\/1\\\\/0957\\\\/5792\\\\/products\\\\/Kraepelin3.gif?v=1439489564\"," +
            "                \"variant_ids\": []" +
            "            }]," +
            "            \"options\": [{" +
            "                \"id\": 2524801731," +
            "                \"name\": \"Color or something\"," +
            "                \"product_id\": 2096063363," +
            "                \"position\": 1" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 6030700419," +
            "                \"title\": \"Teal\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2524801731," +
            "                    \"name\": \"Color or something\"," +
            "                    \"value\": \"Teal\"" +
            "                }]," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 4000," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": false," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }]" +
            "        }]" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify55 =
            "{" +
            "    \"body\": {" +
            "        \"checkout\": {" +
            "            \"created_at\": \"2016-03-07T10:21:03-05:00\"," +
            "            \"currency\": \"CAD\"," +
            "            \"customer_id\": 1137418883," +
            "            \"email\": \"test@test.com\"," +
            "            \"location_id\": null," +
            "            \"order_id\": null," +
            "            \"requires_shipping\": true," +
            "            \"reservation_time\": 300," +
            "            \"source_name\": \"mobile_app\"," +
            "            \"source_identifier\": \"26915715\"," +
            "            \"source_url\": null," +
            "            \"taxes_included\": false," +
            "            \"token\": \"ca7cbeb8fe8f46b973efe661c3a4dbea\"," +
            "            \"updated_at\": \"2016-03-07T10:21:03-05:00\"," +
            "            \"payment_due\": \"2230.99\"," +
            "            \"payment_url\": \"https:\\\\/\\\\/elb.deposit.shopifycs.com\\\\/sessions\"," +
            "            \"reservation_time_left\": 300," +
            "            \"subtotal_price\": \"2230.99\"," +
            "            \"total_price\": \"2230.99\"," +
            "            \"total_tax\": \"0.00\"," +
            "            \"attributes\": []," +
            "            \"note\": \"\"," +
            "            \"order\": null," +
            "            \"order_status_url\": null," +
            "            \"privacy_policy_url\": null," +
            "            \"refund_policy_url\": null," +
            "            \"terms_of_service_url\": null," +
            "            \"user_id\": null," +
            "            \"web_url\": \"https:\\\\/\\\\/checkout.shopify.com\\\\/9575792\\\\/checkouts\\\\/ca7cbeb8fe8f46b973efe661c3a4dbea\"," +
            "            \"tax_lines\": []," +
            "            \"line_items\": [{" +
            "                \"id\": \"8214227f7b6a9694\"," +
            "                \"product_id\": 2096063363," +
            "                \"variant_id\": 6030700419," +
            "                \"sku\": \"\"," +
            "                \"vendor\": \"McCullough Group\"," +
            "                \"title\": \"Actinian Fur Hat\"," +
            "                \"variant_title\": \"Teal\"," +
            "                \"taxable\": false," +
            "                \"requires_shipping\": true," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"line_price\": \"2230.99\"," +
            "                \"properties\": {}," +
            "                \"quantity\": 1," +
            "                \"grams\": 4000," +
            "                \"fulfillment_service\": \"manual\"," +
            "                \"applied_discounts\": []" +
            "            }]," +
            "            \"gift_cards\": []," +
            "            \"shipping_rate\": null," +
            "            \"shipping_address\": {" +
            "                \"id\": 3479864710," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"credit_card\": null," +
            "            \"billing_address\": {" +
            "                \"id\": 3479864646," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"discount\": null" +
            "        }" +
            "    }," +
            "    \"code\": 201," +
            "    \"message\": \"Created\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify56 =
            "{" +
            "    \"body\": {" +
            "        \"product_publications\": [{" +
            "            \"id\": 2626498435," +
            "            \"product_id\": 2096063363," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"updated_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"body_html\": \"parsing the driver won't do anything, we need to calculate the online PNG program!\"," +
            "            \"handle\": \"actinian-fur-hat\"," +
            "            \"product_type\": \"enable bricks-and-clicks e-business\"," +
            "            \"title\": \"Actinian Fur Hat\"," +
            "            \"vendor\": \"McCullough Group\"," +
            "            \"published_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"\"," +
            "            \"images\": [{" +
            "                \"id\": 4277333187," +
            "                \"created_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"position\": 1," +
            "                \"updated_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"product_id\": 2096063363," +
            "                \"src\": \"https:\\\\/\\\\/cdn.shopify.com\\\\/s\\\\/files\\\\/1\\\\/0957\\\\/5792\\\\/products\\\\/Kraepelin3.gif?v=1439489564\"," +
            "                \"variant_ids\": []" +
            "            }]," +
            "            \"options\": [{" +
            "                \"id\": 2524801731," +
            "                \"name\": \"Color or something\"," +
            "                \"product_id\": 2096063363," +
            "                \"position\": 1" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 6030700419," +
            "                \"title\": \"Teal\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2524801731," +
            "                    \"name\": \"Color or something\"," +
            "                    \"value\": \"Teal\"" +
            "                }]," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 4000," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": false," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }]" +
            "        }]" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify57 =
            "{" +
            "    \"body\": {" +
            "        \"checkout\": {" +
            "            \"created_at\": \"2016-03-07T10:21:04-05:00\"," +
            "            \"currency\": \"CAD\"," +
            "            \"customer_id\": 1137418883," +
            "            \"email\": \"test@test.com\"," +
            "            \"location_id\": null," +
            "            \"order_id\": null," +
            "            \"requires_shipping\": true," +
            "            \"reservation_time\": 300," +
            "            \"source_name\": \"mobile_app\"," +
            "            \"source_identifier\": \"26915715\"," +
            "            \"source_url\": null," +
            "            \"taxes_included\": false," +
            "            \"token\": \"25cfbf8f84444b907859a2f8e3a63d00\"," +
            "            \"updated_at\": \"2016-03-07T10:21:04-05:00\"," +
            "            \"payment_due\": \"2230.99\"," +
            "            \"payment_url\": \"https:\\\\/\\\\/elb.deposit.shopifycs.com\\\\/sessions\"," +
            "            \"reservation_time_left\": 299," +
            "            \"subtotal_price\": \"2230.99\"," +
            "            \"total_price\": \"2230.99\"," +
            "            \"total_tax\": \"0.00\"," +
            "            \"attributes\": []," +
            "            \"note\": \"\"," +
            "            \"order\": null," +
            "            \"order_status_url\": null," +
            "            \"privacy_policy_url\": null," +
            "            \"refund_policy_url\": null," +
            "            \"terms_of_service_url\": null," +
            "            \"user_id\": null," +
            "            \"web_url\": \"https:\\\\/\\\\/checkout.shopify.com\\\\/9575792\\\\/checkouts\\\\/25cfbf8f84444b907859a2f8e3a63d00\"," +
            "            \"tax_lines\": []," +
            "            \"line_items\": [{" +
            "                \"id\": \"19f33278b7cd499d\"," +
            "                \"product_id\": 2096063363," +
            "                \"variant_id\": 6030700419," +
            "                \"sku\": \"\"," +
            "                \"vendor\": \"McCullough Group\"," +
            "                \"title\": \"Actinian Fur Hat\"," +
            "                \"variant_title\": \"Teal\"," +
            "                \"taxable\": false," +
            "                \"requires_shipping\": true," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"line_price\": \"2230.99\"," +
            "                \"properties\": {" +
            "                    \"size\": \"large\"," +
            "                    \"color\": \"red\"" +
            "                }," +
            "                \"quantity\": 1," +
            "                \"grams\": 4000," +
            "                \"fulfillment_service\": \"manual\"," +
            "                \"applied_discounts\": []" +
            "            }]," +
            "            \"gift_cards\": []," +
            "            \"shipping_rate\": null," +
            "            \"shipping_address\": {" +
            "                \"id\": 3479864838," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"credit_card\": null," +
            "            \"billing_address\": {" +
            "                \"id\": 3479864774," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"discount\": null" +
            "        }" +
            "    }," +
            "    \"code\": 201," +
            "    \"message\": \"Created\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify58 =
            "{" +
            "    \"body\": {" +
            "        \"checkout\": {" +
            "            \"created_at\": \"2016-03-07T10:21:04-05:00\"," +
            "            \"currency\": \"CAD\"," +
            "            \"customer_id\": 1137418883," +
            "            \"email\": \"test@test.com\"," +
            "            \"location_id\": null," +
            "            \"order_id\": null," +
            "            \"requires_shipping\": true," +
            "            \"reservation_time\": 0," +
            "            \"source_name\": \"mobile_app\"," +
            "            \"source_identifier\": \"26915715\"," +
            "            \"source_url\": null," +
            "            \"taxes_included\": false," +
            "            \"token\": \"25cfbf8f84444b907859a2f8e3a63d00\"," +
            "            \"updated_at\": \"2016-03-07T10:21:04-05:00\"," +
            "            \"payment_due\": \"2230.99\"," +
            "            \"payment_url\": \"https:\\\\/\\\\/elb.deposit.shopifycs.com\\\\/sessions\"," +
            "            \"reservation_time_left\": 0," +
            "            \"subtotal_price\": \"2230.99\"," +
            "            \"total_price\": \"2230.99\"," +
            "            \"total_tax\": \"0.00\"," +
            "            \"attributes\": []," +
            "            \"note\": \"\"," +
            "            \"order\": null," +
            "            \"order_status_url\": null," +
            "            \"privacy_policy_url\": null," +
            "            \"refund_policy_url\": null," +
            "            \"terms_of_service_url\": null," +
            "            \"user_id\": null," +
            "            \"web_url\": \"https:\\\\/\\\\/checkout.shopify.com\\\\/9575792\\\\/checkouts\\\\/25cfbf8f84444b907859a2f8e3a63d00\"," +
            "            \"tax_lines\": []," +
            "            \"line_items\": [{" +
            "                \"id\": \"19f33278b7cd499d\"," +
            "                \"product_id\": 2096063363," +
            "                \"variant_id\": 6030700419," +
            "                \"sku\": \"\"," +
            "                \"vendor\": \"McCullough Group\"," +
            "                \"title\": \"Actinian Fur Hat\"," +
            "                \"variant_title\": \"Teal\"," +
            "                \"taxable\": false," +
            "                \"requires_shipping\": true," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"line_price\": \"2230.99\"," +
            "                \"properties\": {" +
            "                    \"size\": \"large\"," +
            "                    \"color\": \"red\"" +
            "                }," +
            "                \"quantity\": 1," +
            "                \"grams\": 4000," +
            "                \"fulfillment_service\": \"manual\"," +
            "                \"applied_discounts\": []" +
            "            }]," +
            "            \"gift_cards\": []," +
            "            \"shipping_rate\": null," +
            "            \"shipping_address\": {" +
            "                \"id\": 3479864838," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"credit_card\": null," +
            "            \"billing_address\": {" +
            "                \"id\": 3479864774," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"discount\": null" +
            "        }" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify59 =
            "{" +
            "    \"body\": {" +
            "        \"product_publications\": [{" +
            "            \"id\": 2626498435," +
            "            \"product_id\": 2096063363," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"updated_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"body_html\": \"parsing the driver won't do anything, we need to calculate the online PNG program!\"," +
            "            \"handle\": \"actinian-fur-hat\"," +
            "            \"product_type\": \"enable bricks-and-clicks e-business\"," +
            "            \"title\": \"Actinian Fur Hat\"," +
            "            \"vendor\": \"McCullough Group\"," +
            "            \"published_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"\"," +
            "            \"images\": [{" +
            "                \"id\": 4277333187," +
            "                \"created_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"position\": 1," +
            "                \"updated_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"product_id\": 2096063363," +
            "                \"src\": \"https:\\\\/\\\\/cdn.shopify.com\\\\/s\\\\/files\\\\/1\\\\/0957\\\\/5792\\\\/products\\\\/Kraepelin3.gif?v=1439489564\"," +
            "                \"variant_ids\": []" +
            "            }]," +
            "            \"options\": [{" +
            "                \"id\": 2524801731," +
            "                \"name\": \"Color or something\"," +
            "                \"product_id\": 2096063363," +
            "                \"position\": 1" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 6030700419," +
            "                \"title\": \"Teal\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2524801731," +
            "                    \"name\": \"Color or something\"," +
            "                    \"value\": \"Teal\"" +
            "                }]," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 4000," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": false," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }]" +
            "        }]" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify60 =
            "{" +
            "    \"body\": {" +
            "        \"errors\": \"Not Found\"" +
            "    }," +
            "    \"code\": 404," +
            "    \"message\": \"Not Found\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify61 =
            "{" +
            "    \"body\": {" +
            "        \"product_publications\": [{" +
            "            \"id\": 2626498435," +
            "            \"product_id\": 2096063363," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"updated_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"body_html\": \"parsing the driver won't do anything, we need to calculate the online PNG program!\"," +
            "            \"handle\": \"actinian-fur-hat\"," +
            "            \"product_type\": \"enable bricks-and-clicks e-business\"," +
            "            \"title\": \"Actinian Fur Hat\"," +
            "            \"vendor\": \"McCullough Group\"," +
            "            \"published_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"\"," +
            "            \"images\": [{" +
            "                \"id\": 4277333187," +
            "                \"created_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"position\": 1," +
            "                \"updated_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"product_id\": 2096063363," +
            "                \"src\": \"https:\\\\/\\\\/cdn.shopify.com\\\\/s\\\\/files\\\\/1\\\\/0957\\\\/5792\\\\/products\\\\/Kraepelin3.gif?v=1439489564\"," +
            "                \"variant_ids\": []" +
            "            }]," +
            "            \"options\": [{" +
            "                \"id\": 2524801731," +
            "                \"name\": \"Color or something\"," +
            "                \"product_id\": 2096063363," +
            "                \"position\": 1" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 6030700419," +
            "                \"title\": \"Teal\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2524801731," +
            "                    \"name\": \"Color or something\"," +
            "                    \"value\": \"Teal\"" +
            "                }]," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 4000," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": false," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }]" +
            "        }]" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify62 =
            "{" +
            "    \"body\": {" +
            "        \"checkout\": {" +
            "            \"created_at\": \"2016-03-07T10:21:05-05:00\"," +
            "            \"currency\": \"CAD\"," +
            "            \"customer_id\": null," +
            "            \"email\": \"\"," +
            "            \"location_id\": null," +
            "            \"order_id\": null," +
            "            \"requires_shipping\": true," +
            "            \"reservation_time\": 300," +
            "            \"source_name\": \"mobile_app\"," +
            "            \"source_identifier\": \"26915715\"," +
            "            \"source_url\": null," +
            "            \"taxes_included\": false," +
            "            \"token\": \"c58cf1b15e82f69cb7b43051f4a91b52\"," +
            "            \"updated_at\": \"2016-03-07T10:21:05-05:00\"," +
            "            \"payment_due\": \"2230.99\"," +
            "            \"payment_url\": \"https:\\\\/\\\\/elb.deposit.shopifycs.com\\\\/sessions\"," +
            "            \"reservation_time_left\": 300," +
            "            \"subtotal_price\": \"2230.99\"," +
            "            \"total_price\": \"2230.99\"," +
            "            \"total_tax\": \"0.00\"," +
            "            \"attributes\": []," +
            "            \"note\": \"\"," +
            "            \"order\": null," +
            "            \"order_status_url\": null," +
            "            \"privacy_policy_url\": null," +
            "            \"refund_policy_url\": null," +
            "            \"terms_of_service_url\": null," +
            "            \"user_id\": null," +
            "            \"web_url\": \"https:\\\\/\\\\/checkout.shopify.com\\\\/9575792\\\\/checkouts\\\\/c58cf1b15e82f69cb7b43051f4a91b52\"," +
            "            \"tax_lines\": []," +
            "            \"line_items\": [{" +
            "                \"id\": \"8c9442890ea20318\"," +
            "                \"product_id\": 2096063363," +
            "                \"variant_id\": 6030700419," +
            "                \"sku\": \"\"," +
            "                \"vendor\": \"McCullough Group\"," +
            "                \"title\": \"Actinian Fur Hat\"," +
            "                \"variant_title\": \"Teal\"," +
            "                \"taxable\": false," +
            "                \"requires_shipping\": true," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"line_price\": \"2230.99\"," +
            "                \"properties\": {" +
            "                    \"size\": \"large\"," +
            "                    \"color\": \"red\"" +
            "                }," +
            "                \"quantity\": 1," +
            "                \"grams\": 4000," +
            "                \"fulfillment_service\": \"manual\"," +
            "                \"applied_discounts\": []" +
            "            }]," +
            "            \"gift_cards\": []," +
            "            \"shipping_rate\": null," +
            "            \"shipping_address\": null," +
            "            \"credit_card\": null," +
            "            \"billing_address\": null," +
            "            \"discount\": null" +
            "        }" +
            "    }," +
            "    \"code\": 201," +
            "    \"message\": \"Created\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify63 =
            "{" +
            "    \"body\": {" +
            "        \"errors\": {" +
            "            \"checkout\": {" +
            "                \"shipping_address\": [{" +
            "                    \"code\": \"blank\"," +
            "                    \"message\": \"can't be blank\"," +
            "                    \"options\": {}" +
            "                }]" +
            "            }" +
            "        }" +
            "    }," +
            "    \"code\": 412," +
            "    \"message\": \"Precondition Failed\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify64 =
            "{" +
            "    \"body\": {" +
            "        \"errors\": \"Not Found\"" +
            "    }," +
            "    \"code\": 404," +
            "    \"message\": \"Not Found\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify65 =
            "{" +
            "    \"body\": \"\"," +
            "    \"code\": 400," +
            "    \"message\": \"Bad Request\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify66 =
            "{" +
            "    \"body\": \"\"," +
            "    \"code\": 400," +
            "    \"message\": \"Bad Request\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify67 =
            "{" +
            "   \"body\": \"<!doctype html>\\n<!--[if lt IE 7]> <html class=\\\"no-js ie6 oldie\\\" lang=\\\"en\\\"> <![endif]-->\\n<!--[if IE 7]> <html class=\\\"no-js ie7 oldie\\\" lang=\\\"en\\\"> <![endif]-->\\n<!--[if IE 8]> <html class=\\\"no-js ie8 oldie\\\" lang=\\\"en\\\"> <![endif]-->\\n<!--[if gt IE 8]><!--> <html class=\\\"no-js\\\" lang=\\\"en\\\"> <!--<![endif]-->\\n<head>\\n  <meta charset=\\\"UTF-8\\\">\\n  <title>Create an Ecommerce Website and Sell Online! Ecommerce Software by Shopify</title>\\n  <meta name=\\\"description\\\" content=\\\"Shopify provides a reliable Ecommerce platform so you focus on selling online! Integrated hosting, shopping cart and Ecommerce payment solution all in one!\\\" />\\n  <meta name=\\\"viewport\\\" content=\\\"width=1100, initial-scale=1\\\" />\\n  <link rel=\\\"shortcut icon\\\" type=\\\"image/x-icon\\\" href=\\\"//cdn.shopify.com/s/assets/favicon-4425e7970f1327bc362265f54e8c9c6a4e96385b3987760637977078e28ffe92.png\\\" />\\n\\n  <link rel=\\\"stylesheet\\\" media=\\\"screen, projection\\\" href=\\\"//cdn.shopify.com/s/assets/external-assets-413e902aa978666b6163057fd975ab2b3f8484d92a64d7c44301f6f68b713b0e.css\\\" crossorigin=\\\"anonymous\\\" integrity=\\\"sha256-QT6QKql4ZmthYwV/2XWrKz+EhNkqZNfEQwH29otxOw4=\\\" />\\n  <script src=\\\"//cdn.shopify.com/s/assets/vendor/jquery-2.0.3-fbb0666ac3cbc8879f95692c15953c28256037229b4b05741af0b55e0a98da70.js\\\" crossorigin=\\\"anonymous\\\" integrity=\\\"sha256-+7BmasPLyIeflWksFZU8KCVgNyKbSwV0GvC1XgqY2nA=\\\"></script>\\n\\n  <style>\\n    <!--\\n    /* Page Styles */\\n    body { background: #F6F6F6; font-size: 62.5%; }\\n    .signup .btn-green { padding: 10px 14px; }\\n    #subpage #content-wrapper {\\n      width: 1020px;\\n      float: left;\\n      background: #fff;\\n      margin: 135px 0 10px -20px;\\n      padding: 35px 20px;\\n      -webkit-box-shadow: 0 0 20px rgba(0,0,0,0.1),0px 0px 0px rgba(0,0,0,0);\\n      -moz-box-shadow: 0 0 20px rgba(0,0,0,0.1),0px 0px 0px rgba(0,0,0,0);\\n      box-shadow: 0 0 20px rgba(0,0,0,0.1),0px 0px 0px rgba(0,0,0,0);\\n    }\\n    #pg-store404 { padding: 130px 0 140px 0; }\\n    #pg-store404 h1 { font-size: 2rem; }\\n\\n    footer { background: none; text-align: center; font-size: 12px; padding: 50px 0; }\\n    footer p { color: #999; margin: 0 !important; }\\n    footer p a, footer p a:hover, footer p a:active { color: #777; text-decoration: underline; }\\n    .btn-green{color:#fff !important;background-color:#8EC023;border-top:#DBFF8E;border-right:1px solid #65A32E;border-bottom:1px solid #6B9A20;border-left:1px solid #65A32E;text-shadow:0 -1px 1px #4e9409;-webkit-background-clip:padding-box;background-color:#75B600;background-image:-o-linear-gradient(#9bdc27, #75b600);background-image:-webkit-gradient(linear, left bottom, left top, color-stop(0, #75b600), color-stop(1, #9bdc27));background-image:-moz-linear-gradient(center bottom, #75b600 0%, #9bdc27 100%);-webkit-box-shadow:0 1px 0 0 #a6e95b inset,0 1px 2px 0 rgba(0, 0, 0, 0.3);-moz-box-shadow:0 1px 0 0 #a6e95b inset,0 1px 2px 0 rgba(0, 0, 0, 0.3);box-shadow:0 1px 0 0 #a6e95b inset,0 1px 2px 0 rgba(0, 0, 0, 0.3);-o-transition:none 0.3s ease-in-out 0s;-webkit-transition:none 0.3s ease-in-out 0s;-moz-transition:none 0.3s ease-in-out 0s;-webkit-border-radius:3px;-moz-border-radius:3px;border-radius:3px;}.btn-green:hover{background-color:#8EC023;border-top:#DBFF8E;border-right:1px solid #65A32E;border-bottom:1px solid #6B9A20;border-left:1px solid #65A32E;cursor:pointer;text-shadow:0 -1px 1px #458505;-webkit-background-clip:padding-box;background-color:#70AE00;background-image:-o-linear-gradient(#95d622, #70ae00);background-image:-webkit-gradient(linear, left bottom, left top, color-stop(0, #70ae00), color-stop(1, #95d622));background-image:-moz-linear-gradient(center bottom, #70ae00 0%, #95d622 100%);-webkit-box-shadow:0 1px 0 0 #a6e05b inset,0 1px 2px 0 rgba(0, 0, 0, 0.2);-moz-box-shadow:0 1px 0 0 #a6e05b inset,0 1px 2px 0 rgba(0, 0, 0, 0.2);box-shadow:0 1px 0 0 #a6e05b inset,0 1px 2px 0 rgba(0, 0, 0, 0.2);}\\n    .btn-green:active{background:#98D332;border:1px solid #588C15;border-bottom:1px solid #508E0E;text-shadow:0 -1px 1px #63a423;-webkit-background-clip:padding-box;-webkit-box-shadow:0 0 6px 3px #68b516 inset,0 1px 0 0 #000;-moz-box-shadow:0 0 6px 3px #68b516 inset,0 1px 0 0 #000;box-shadow:0 0 6px 3px #68b516 inset,0 1px 0 0 #000;}\\n    -->\\n  </style>\\n\\n</head>\\n\\n<body id=\\\"subpage\\\">\\n\\n  <!-- Begin main-nav -->\\n  <div class=\\\"wrapper\\\" id=\\\"shopify-nav\\\">\\n    <div class=\\\"row\\\">\\n      <div class=\\\"col3\\\">\\n        <a href=\\\"//www.shopify.com\\\">\\n          <span id=\\\"branding\\\"><strong>Shopify Ecommerce - Shopping Cart &amp; Software</strong></span>\\n        </a>\\n      </div>\\n      <div class=\\\"col9\\\">\\n        <nav>\\n          <ul class=\\\"sub-menu\\\">\\n            <li><a href=\\\"//www.shopify.com/?utm_source=ExpiredDomainLink&amp;utm_medium=textlink&amp;utm_campaign=ExpiredDomainLink\\\">Want to setup an online store?</a></li>\\n            <li class=\\\"signup\\\"><a href=\\\"//www.shopify.com/?utm_source=ExpiredDomainLink&amp;utm_medium=textlink&amp;utm_campaign=ExpiredDomainLink\\\"><span class=\\\"btn-green\\\">Sign up for Shopify</span></a></li>\\n          </ul>\\n        </nav>\\n      </div>\\n    </div>\\n  </div>\\n  <!-- End main-nav -->\\n\\n  <!-- Begin content -->\\n  <div class=\\\"wrapper content\\\">\\n    <div class=\\\"row\\\">\\n      <div id=\\\"content-wrapper\\\" class=\\\"clearfix\\\">\\n\\n        <div id=\\\"pg-store404\\\">\\n\\n          <div id=\\\"shop-not-found\\\">\\n              <h1 class=\\\"tc\\\">Sorry, this shop is currently unavailable.</h1>\\n          </div>\\n\\n          <div id=\\\"custom-msg\\\" style=\\\"display:none\\\">\\n            <h1 class=\\\"tc\\\"></h1>\\n          </div>\\n\\n          <script type=\\\"text/javascript\\\">\\n            $(function(){\\n              var hostname = window.location.hostname;\\n              if (hostname != 'checkout.shopify.com' && hostname != 'app.shopify.com') {\\n                var re = /\\\\.(shopify|shopifyadmin)\\\\.com$/;\\n\\n                if (hostname.match(re)) {\\n                  var myshopifyDomain = encodeURI(hostname.replace(re,\\\".myshopify.com\\\"));\\n                  var href = encodeURI(window.location.href.replace(hostname, myshopifyDomain));\\n                  $(\\\"#custom-msg h1\\\").html('Did you mean <a href=\\\"'+href+'\\\">'+myshopifyDomain+'</a>?');\\n                  $(\\\"#shop-not-found\\\").hide();\\n                  $(\\\"#custom-msg\\\").show();\\n                } else if (!hostname.match(/\\\\.myshopify\\\\.com$/)) {\\n                    $.ajax({\\n                      url: 'https://app.shopify.com/services/last_shop.json',\\n                      dataType: 'jsonp',\\n                      jsonp: 'callback',\\n                      success: function(response){\\n                        if (response.last_shop != undefined) {\\n                          $(\\\"#custom-msg h1\\\").html('Only one step left!<br>To finish setting up your new web address, go to <a href=\\\"https://'+response.last_shop+'/admin/settings/domains\\\">your domain settings</a>, click \\\"Add existing domain\\\", and enter: '+hostname);\\n                          $(\\\"#shop-not-found\\\").hide();\\n                          $(\\\"#custom-msg\\\").show();\\n                        }\\n                      }\\n                    });\\n                }\\n              }\\n            });\\n          </script>\\n        </div>\\n      </div>\\n    </div>\\n  </div>\\n  <!-- End content -->\\n\\n  <footer>\\n  </footer>\\n\\n</body>\\n</html>\\n\",\n" +
            "   \"code\": 404," +
            "   \"message\": \"Not Found\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify68 =
            "{" +
            "    \"body\": {" +
            "        \"product_publications\": [{" +
            "            \"id\": 2626498435," +
            "            \"product_id\": 2096063363," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"updated_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"body_html\": \"parsing the driver won't do anything, we need to calculate the online PNG program!\"," +
            "            \"handle\": \"actinian-fur-hat\"," +
            "            \"product_type\": \"enable bricks-and-clicks e-business\"," +
            "            \"title\": \"Actinian Fur Hat\"," +
            "            \"vendor\": \"McCullough Group\"," +
            "            \"published_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"\"," +
            "            \"images\": [{" +
            "                \"id\": 4277333187," +
            "                \"created_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"position\": 1," +
            "                \"updated_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"product_id\": 2096063363," +
            "                \"src\": \"https:\\\\/\\\\/cdn.shopify.com\\\\/s\\\\/files\\\\/1\\\\/0957\\\\/5792\\\\/products\\\\/Kraepelin3.gif?v=1439489564\"," +
            "                \"variant_ids\": []" +
            "            }]," +
            "            \"options\": [{" +
            "                \"id\": 2524801731," +
            "                \"name\": \"Color or something\"," +
            "                \"product_id\": 2096063363," +
            "                \"position\": 1" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 6030700419," +
            "                \"title\": \"Teal\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2524801731," +
            "                    \"name\": \"Color or something\"," +
            "                    \"value\": \"Teal\"" +
            "                }]," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 4000," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": false," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }]" +
            "        }]" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify69 =
            "{" +
            "    \"body\": {" +
            "        \"checkout\": {" +
            "            \"created_at\": \"2016-03-07T10:21:07-05:00\"," +
            "            \"currency\": \"CAD\"," +
            "            \"customer_id\": 1137418883," +
            "            \"email\": \"test@test.com\"," +
            "            \"location_id\": null," +
            "            \"order_id\": null," +
            "            \"requires_shipping\": true," +
            "            \"reservation_time\": 300," +
            "            \"source_name\": \"mobile_app\"," +
            "            \"source_identifier\": \"26915715\"," +
            "            \"source_url\": null," +
            "            \"taxes_included\": false," +
            "            \"token\": \"cc1979328f692660518ee0832aed1fbc\"," +
            "            \"updated_at\": \"2016-03-07T10:21:07-05:00\"," +
            "            \"payment_due\": \"2230.99\"," +
            "            \"payment_url\": \"https:\\\\/\\\\/elb.deposit.shopifycs.com\\\\/sessions\"," +
            "            \"reservation_time_left\": 300," +
            "            \"subtotal_price\": \"2230.99\"," +
            "            \"total_price\": \"2230.99\"," +
            "            \"total_tax\": \"0.00\"," +
            "            \"attributes\": []," +
            "            \"note\": \"\"," +
            "            \"order\": null," +
            "            \"order_status_url\": null," +
            "            \"privacy_policy_url\": null," +
            "            \"refund_policy_url\": null," +
            "            \"terms_of_service_url\": null," +
            "            \"user_id\": null," +
            "            \"web_url\": \"https:\\\\/\\\\/checkout.shopify.com\\\\/9575792\\\\/checkouts\\\\/cc1979328f692660518ee0832aed1fbc\"," +
            "            \"tax_lines\": []," +
            "            \"line_items\": [{" +
            "                \"id\": \"29b4bc77dcd93f8e\"," +
            "                \"product_id\": 2096063363," +
            "                \"variant_id\": 6030700419," +
            "                \"sku\": \"\"," +
            "                \"vendor\": \"McCullough Group\"," +
            "                \"title\": \"Actinian Fur Hat\"," +
            "                \"variant_title\": \"Teal\"," +
            "                \"taxable\": false," +
            "                \"requires_shipping\": true," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"line_price\": \"2230.99\"," +
            "                \"properties\": {" +
            "                    \"size\": \"large\"," +
            "                    \"color\": \"red\"" +
            "                }," +
            "                \"quantity\": 1," +
            "                \"grams\": 4000," +
            "                \"fulfillment_service\": \"manual\"," +
            "                \"applied_discounts\": []" +
            "            }]," +
            "            \"gift_cards\": []," +
            "            \"shipping_rate\": null," +
            "            \"shipping_address\": {" +
            "                \"id\": 3479865350," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"credit_card\": null," +
            "            \"billing_address\": {" +
            "                \"id\": 3479865286," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"discount\": null" +
            "        }" +
            "    }," +
            "    \"code\": 201," +
            "    \"message\": \"Created\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify70 =
            "{" +
            "    \"body\": {" +
            "        \"gift_card\": {" +
            "            \"id\": 9741254," +
            "            \"last_characters\": \"rd11\"," +
            "            \"balance\": \"11.00\"," +
            "            \"amount_used\": \"11.00\"," +
            "            \"checkout\": {" +
            "                \"payment_due\": \"2219.99\"" +
            "            }" +
            "        }" +
            "    }," +
            "    \"code\": 201," +
            "    \"message\": \"Created\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify71 =
            "{" +
            "    \"body\": {" +
            "        \"gift_card\": {" +
            "            \"id\": 9741318," +
            "            \"last_characters\": \"rd25\"," +
            "            \"balance\": \"25.00\"," +
            "            \"amount_used\": \"25.00\"," +
            "            \"checkout\": {" +
            "                \"payment_due\": \"2194.99\"" +
            "            }" +
            "        }" +
            "    }," +
            "    \"code\": 201," +
            "    \"message\": \"Created\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify72 =
            "{" +
            "    \"body\": {" +
            "        \"gift_card\": {" +
            "            \"id\": 9741382," +
            "            \"last_characters\": \"rd50\"," +
            "            \"balance\": \"50.00\"," +
            "            \"amount_used\": \"50.00\"," +
            "            \"checkout\": {" +
            "                \"payment_due\": \"2144.99\"" +
            "            }" +
            "        }" +
            "    }," +
            "    \"code\": 201," +
            "    \"message\": \"Created\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify73 =
            "{" +
            "    \"body\": {" +
            "        \"gift_card\": {" +
            "            \"id\": 9741318," +
            "            \"last_characters\": \"rd25\"," +
            "            \"balance\": \"25.00\"," +
            "            \"amount_used\": \"25.00\"," +
            "            \"checkout\": {" +
            "                \"payment_due\": \"2169.99\"" +
            "            }" +
            "        }" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify74 =
            "{" +
            "    \"body\": {" +
            "        \"gift_card\": {" +
            "            \"id\": 9741254," +
            "            \"last_characters\": \"rd11\"," +
            "            \"balance\": \"11.00\"," +
            "            \"amount_used\": \"11.00\"," +
            "            \"checkout\": {" +
            "                \"payment_due\": \"2180.99\"" +
            "            }" +
            "        }" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify75 =
            "{" +
            "    \"body\": {" +
            "        \"gift_card\": {" +
            "            \"id\": 9741382," +
            "            \"last_characters\": \"rd50\"," +
            "            \"balance\": \"50.00\"," +
            "            \"amount_used\": \"50.00\"," +
            "            \"checkout\": {" +
            "                \"payment_due\": \"2230.99\"" +
            "            }" +
            "        }" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify76 =
            "{" +
            "    \"body\": {" +
            "        \"product_publications\": [{" +
            "            \"id\": 2626498435," +
            "            \"product_id\": 2096063363," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"updated_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"body_html\": \"parsing the driver won't do anything, we need to calculate the online PNG program!\"," +
            "            \"handle\": \"actinian-fur-hat\"," +
            "            \"product_type\": \"enable bricks-and-clicks e-business\"," +
            "            \"title\": \"Actinian Fur Hat\"," +
            "            \"vendor\": \"McCullough Group\"," +
            "            \"published_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"\"," +
            "            \"images\": [{" +
            "                \"id\": 4277333187," +
            "                \"created_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"position\": 1," +
            "                \"updated_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"product_id\": 2096063363," +
            "                \"src\": \"https:\\\\/\\\\/cdn.shopify.com\\\\/s\\\\/files\\\\/1\\\\/0957\\\\/5792\\\\/products\\\\/Kraepelin3.gif?v=1439489564\"," +
            "                \"variant_ids\": []" +
            "            }]," +
            "            \"options\": [{" +
            "                \"id\": 2524801731," +
            "                \"name\": \"Color or something\"," +
            "                \"product_id\": 2096063363," +
            "                \"position\": 1" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 6030700419," +
            "                \"title\": \"Teal\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2524801731," +
            "                    \"name\": \"Color or something\"," +
            "                    \"value\": \"Teal\"" +
            "                }]," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 4000," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": false," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }]" +
            "        }]" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify77 =
            "{" +
            "    \"body\": {" +
            "        \"checkout\": {" +
            "            \"created_at\": \"2016-03-07T10:21:10-05:00\"," +
            "            \"currency\": \"CAD\"," +
            "            \"customer_id\": 1137418883," +
            "            \"email\": \"test@test.com\"," +
            "            \"location_id\": null," +
            "            \"order_id\": null," +
            "            \"requires_shipping\": true," +
            "            \"reservation_time\": 300," +
            "            \"source_name\": \"mobile_app\"," +
            "            \"source_identifier\": \"26915715\"," +
            "            \"source_url\": null," +
            "            \"taxes_included\": false," +
            "            \"token\": \"f81c5cf90f733a8835ad10a54cdb50e4\"," +
            "            \"updated_at\": \"2016-03-07T10:21:10-05:00\"," +
            "            \"payment_due\": \"2230.99\"," +
            "            \"payment_url\": \"https:\\\\/\\\\/elb.deposit.shopifycs.com\\\\/sessions\"," +
            "            \"reservation_time_left\": 299," +
            "            \"subtotal_price\": \"2230.99\"," +
            "            \"total_price\": \"2230.99\"," +
            "            \"total_tax\": \"0.00\"," +
            "            \"attributes\": []," +
            "            \"note\": \"\"," +
            "            \"order\": null," +
            "            \"order_status_url\": null," +
            "            \"privacy_policy_url\": null," +
            "            \"refund_policy_url\": null," +
            "            \"terms_of_service_url\": null," +
            "            \"user_id\": null," +
            "            \"web_url\": \"https:\\\\/\\\\/checkout.shopify.com\\\\/9575792\\\\/checkouts\\\\/f81c5cf90f733a8835ad10a54cdb50e4\"," +
            "            \"tax_lines\": []," +
            "            \"line_items\": [{" +
            "                \"id\": \"db87f1edcb04bf8b\"," +
            "                \"product_id\": 2096063363," +
            "                \"variant_id\": 6030700419," +
            "                \"sku\": \"\"," +
            "                \"vendor\": \"McCullough Group\"," +
            "                \"title\": \"Actinian Fur Hat\"," +
            "                \"variant_title\": \"Teal\"," +
            "                \"taxable\": false," +
            "                \"requires_shipping\": true," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"line_price\": \"2230.99\"," +
            "                \"properties\": {" +
            "                    \"size\": \"large\"," +
            "                    \"color\": \"red\"" +
            "                }," +
            "                \"quantity\": 1," +
            "                \"grams\": 4000," +
            "                \"fulfillment_service\": \"manual\"," +
            "                \"applied_discounts\": []" +
            "            }]," +
            "            \"gift_cards\": []," +
            "            \"shipping_rate\": null," +
            "            \"shipping_address\": {" +
            "                \"id\": 3479865862," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"credit_card\": null," +
            "            \"billing_address\": {" +
            "                \"id\": 3479865798," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"discount\": null" +
            "        }" +
            "    }," +
            "    \"code\": 201," +
            "    \"message\": \"Created\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify78 =
            "{" +
            "    \"body\": {" +
            "        \"errors\": {" +
            "            \"gift_card\": {" +
            "                \"code\": [{" +
            "                    \"code\": \"gift_card_code_invalid\"," +
            "                    \"message\": \"Code is invalid\"," +
            "                    \"options\": {}" +
            "                }]" +
            "            }" +
            "        }" +
            "    }," +
            "    \"code\": 422," +
            "    \"message\": \"Unprocessable Entity\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify79 =
            "{" +
            "    \"body\": {" +
            "        \"product_publications\": [{" +
            "            \"id\": 2626498435," +
            "            \"product_id\": 2096063363," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"updated_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"body_html\": \"parsing the driver won't do anything, we need to calculate the online PNG program!\"," +
            "            \"handle\": \"actinian-fur-hat\"," +
            "            \"product_type\": \"enable bricks-and-clicks e-business\"," +
            "            \"title\": \"Actinian Fur Hat\"," +
            "            \"vendor\": \"McCullough Group\"," +
            "            \"published_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"\"," +
            "            \"images\": [{" +
            "                \"id\": 4277333187," +
            "                \"created_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"position\": 1," +
            "                \"updated_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"product_id\": 2096063363," +
            "                \"src\": \"https:\\\\/\\\\/cdn.shopify.com\\\\/s\\\\/files\\\\/1\\\\/0957\\\\/5792\\\\/products\\\\/Kraepelin3.gif?v=1439489564\"," +
            "                \"variant_ids\": []" +
            "            }]," +
            "            \"options\": [{" +
            "                \"id\": 2524801731," +
            "                \"name\": \"Color or something\"," +
            "                \"product_id\": 2096063363," +
            "                \"position\": 1" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 6030700419," +
            "                \"title\": \"Teal\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2524801731," +
            "                    \"name\": \"Color or something\"," +
            "                    \"value\": \"Teal\"" +
            "                }]," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 4000," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": false," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }]" +
            "        }]" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify80 =
            "{" +
            "    \"body\": {" +
            "        \"checkout\": {" +
            "            \"created_at\": \"2016-03-07T10:21:11-05:00\"," +
            "            \"currency\": \"CAD\"," +
            "            \"customer_id\": 1137418883," +
            "            \"email\": \"test@test.com\"," +
            "            \"location_id\": null," +
            "            \"order_id\": null," +
            "            \"requires_shipping\": true," +
            "            \"reservation_time\": 300," +
            "            \"source_name\": \"mobile_app\"," +
            "            \"source_identifier\": \"26915715\"," +
            "            \"source_url\": null," +
            "            \"taxes_included\": false," +
            "            \"token\": \"7ed4149bfad6bb55e22a545828ff3e5a\"," +
            "            \"updated_at\": \"2016-03-07T10:21:11-05:00\"," +
            "            \"payment_due\": \"2230.99\"," +
            "            \"payment_url\": \"https:\\\\/\\\\/elb.deposit.shopifycs.com\\\\/sessions\"," +
            "            \"reservation_time_left\": 300," +
            "            \"subtotal_price\": \"2230.99\"," +
            "            \"total_price\": \"2230.99\"," +
            "            \"total_tax\": \"0.00\"," +
            "            \"attributes\": []," +
            "            \"note\": \"\"," +
            "            \"order\": null," +
            "            \"order_status_url\": null," +
            "            \"privacy_policy_url\": null," +
            "            \"refund_policy_url\": null," +
            "            \"terms_of_service_url\": null," +
            "            \"user_id\": null," +
            "            \"web_url\": \"https:\\\\/\\\\/checkout.shopify.com\\\\/9575792\\\\/checkouts\\\\/7ed4149bfad6bb55e22a545828ff3e5a\"," +
            "            \"tax_lines\": []," +
            "            \"line_items\": [{" +
            "                \"id\": \"b90cc64795839306\"," +
            "                \"product_id\": 2096063363," +
            "                \"variant_id\": 6030700419," +
            "                \"sku\": \"\"," +
            "                \"vendor\": \"McCullough Group\"," +
            "                \"title\": \"Actinian Fur Hat\"," +
            "                \"variant_title\": \"Teal\"," +
            "                \"taxable\": false," +
            "                \"requires_shipping\": true," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"line_price\": \"2230.99\"," +
            "                \"properties\": {" +
            "                    \"size\": \"large\"," +
            "                    \"color\": \"red\"" +
            "                }," +
            "                \"quantity\": 1," +
            "                \"grams\": 4000," +
            "                \"fulfillment_service\": \"manual\"," +
            "                \"applied_discounts\": []" +
            "            }]," +
            "            \"gift_cards\": []," +
            "            \"shipping_rate\": null," +
            "            \"shipping_address\": {" +
            "                \"id\": 3479865990," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"credit_card\": null," +
            "            \"billing_address\": {" +
            "                \"id\": 3479865926," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"discount\": null" +
            "        }" +
            "    }," +
            "    \"code\": 201," +
            "    \"message\": \"Created\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify81 =
            "{" +
            "    \"body\": {" +
            "        \"gift_card\": {" +
            "            \"id\": 9741446," +
            "            \"last_characters\": \"rd11\"," +
            "            \"balance\": \"11.00\"," +
            "            \"amount_used\": \"11.00\"," +
            "            \"checkout\": {" +
            "                \"payment_due\": \"2219.99\"" +
            "            }" +
            "        }" +
            "    }," +
            "    \"code\": 201," +
            "    \"message\": \"Created\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify82 =
            "{" +
            "    \"body\": {" +
            "        \"gift_card\": {" +
            "            \"id\": 9741510," +
            "            \"last_characters\": \"rd25\"," +
            "            \"balance\": \"25.00\"," +
            "            \"amount_used\": \"25.00\"," +
            "            \"checkout\": {" +
            "                \"payment_due\": \"2194.99\"" +
            "            }" +
            "        }" +
            "    }," +
            "    \"code\": 201," +
            "    \"message\": \"Created\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify83 =
            "{" +
            "    \"body\": {" +
            "        \"gift_card\": {" +
            "            \"id\": 9741574," +
            "            \"last_characters\": \"rd50\"," +
            "            \"balance\": \"50.00\"," +
            "            \"amount_used\": \"50.00\"," +
            "            \"checkout\": {" +
            "                \"payment_due\": \"2144.99\"" +
            "            }" +
            "        }" +
            "    }," +
            "    \"code\": 201," +
            "    \"message\": \"Created\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify84 =
            "{" +
            "    \"body\": {" +
            "        \"gift_card\": {" +
            "            \"id\": 9741510," +
            "            \"last_characters\": \"rd25\"," +
            "            \"balance\": \"25.00\"," +
            "            \"amount_used\": \"25.00\"," +
            "            \"checkout\": {" +
            "                \"payment_due\": \"2169.99\"" +
            "            }" +
            "        }" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify85 =
            "{" +
            "    \"body\": {" +
            "        \"gift_card\": {" +
            "            \"id\": 9741446," +
            "            \"last_characters\": \"rd11\"," +
            "            \"balance\": \"11.00\"," +
            "            \"amount_used\": \"11.00\"," +
            "            \"checkout\": {" +
            "                \"payment_due\": \"2180.99\"" +
            "            }" +
            "        }" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify86 =
            "{" +
            "    \"body\": {" +
            "        \"product_publications\": [{" +
            "            \"id\": 2626498435," +
            "            \"product_id\": 2096063363," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"updated_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"body_html\": \"parsing the driver won't do anything, we need to calculate the online PNG program!\"," +
            "            \"handle\": \"actinian-fur-hat\"," +
            "            \"product_type\": \"enable bricks-and-clicks e-business\"," +
            "            \"title\": \"Actinian Fur Hat\"," +
            "            \"vendor\": \"McCullough Group\"," +
            "            \"published_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"\"," +
            "            \"images\": [{" +
            "                \"id\": 4277333187," +
            "                \"created_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"position\": 1," +
            "                \"updated_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"product_id\": 2096063363," +
            "                \"src\": \"https:\\\\/\\\\/cdn.shopify.com\\\\/s\\\\/files\\\\/1\\\\/0957\\\\/5792\\\\/products\\\\/Kraepelin3.gif?v=1439489564\"," +
            "                \"variant_ids\": []" +
            "            }]," +
            "            \"options\": [{" +
            "                \"id\": 2524801731," +
            "                \"name\": \"Color or something\"," +
            "                \"product_id\": 2096063363," +
            "                \"position\": 1" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 6030700419," +
            "                \"title\": \"Teal\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2524801731," +
            "                    \"name\": \"Color or something\"," +
            "                    \"value\": \"Teal\"" +
            "                }]," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 4000," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": false," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }]" +
            "        }]" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify87 =
            "{" +
            "    \"body\": {" +
            "        \"checkout\": {" +
            "            \"created_at\": \"2016-03-07T10:21:14-05:00\"," +
            "            \"currency\": \"CAD\"," +
            "            \"customer_id\": 1137418883," +
            "            \"email\": \"test@test.com\"," +
            "            \"location_id\": null," +
            "            \"order_id\": null," +
            "            \"requires_shipping\": true," +
            "            \"reservation_time\": 300," +
            "            \"source_name\": \"mobile_app\"," +
            "            \"source_identifier\": \"26915715\"," +
            "            \"source_url\": null," +
            "            \"taxes_included\": false," +
            "            \"token\": \"10972b56018ff82d387c738c18f43b4a\"," +
            "            \"updated_at\": \"2016-03-07T10:21:14-05:00\"," +
            "            \"payment_due\": \"2230.99\"," +
            "            \"payment_url\": \"https:\\\\/\\\\/elb.deposit.shopifycs.com\\\\/sessions\"," +
            "            \"reservation_time_left\": 300," +
            "            \"subtotal_price\": \"2230.99\"," +
            "            \"total_price\": \"2230.99\"," +
            "            \"total_tax\": \"0.00\"," +
            "            \"attributes\": []," +
            "            \"note\": \"\"," +
            "            \"order\": null," +
            "            \"order_status_url\": null," +
            "            \"privacy_policy_url\": null," +
            "            \"refund_policy_url\": null," +
            "            \"terms_of_service_url\": null," +
            "            \"user_id\": null," +
            "            \"web_url\": \"https:\\\\/\\\\/checkout.shopify.com\\\\/9575792\\\\/checkouts\\\\/10972b56018ff82d387c738c18f43b4a\"," +
            "            \"tax_lines\": []," +
            "            \"line_items\": [{" +
            "                \"id\": \"ec72b8479b279867\"," +
            "                \"product_id\": 2096063363," +
            "                \"variant_id\": 6030700419," +
            "                \"sku\": \"\"," +
            "                \"vendor\": \"McCullough Group\"," +
            "                \"title\": \"Actinian Fur Hat\"," +
            "                \"variant_title\": \"Teal\"," +
            "                \"taxable\": false," +
            "                \"requires_shipping\": true," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"line_price\": \"2230.99\"," +
            "                \"properties\": {" +
            "                    \"size\": \"large\"," +
            "                    \"color\": \"red\"" +
            "                }," +
            "                \"quantity\": 1," +
            "                \"grams\": 4000," +
            "                \"fulfillment_service\": \"manual\"," +
            "                \"applied_discounts\": []" +
            "            }]," +
            "            \"gift_cards\": []," +
            "            \"shipping_rate\": null," +
            "            \"shipping_address\": {" +
            "                \"id\": 3479866246," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"credit_card\": null," +
            "            \"billing_address\": {" +
            "                \"id\": 3479866182," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"discount\": null" +
            "        }" +
            "    }," +
            "    \"code\": 201," +
            "    \"message\": \"Created\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify88 =
            "{" +
            "    \"body\": {" +
            "        \"gift_card\": {" +
            "            \"id\": 9741638," +
            "            \"last_characters\": \"rd11\"," +
            "            \"balance\": \"11.00\"," +
            "            \"amount_used\": \"11.00\"," +
            "            \"checkout\": {" +
            "                \"payment_due\": \"2219.99\"" +
            "            }" +
            "        }" +
            "    }," +
            "    \"code\": 201," +
            "    \"message\": \"Created\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify89 =
            "{" +
            "    \"body\": {" +
            "        \"gift_card\": {" +
            "            \"id\": 9741638," +
            "            \"last_characters\": \"rd11\"," +
            "            \"balance\": \"11.00\"," +
            "            \"amount_used\": \"11.00\"," +
            "            \"checkout\": {" +
            "                \"payment_due\": \"2230.99\"" +
            "            }" +
            "        }" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify90 =
            "{" +
            "    \"body\": {" +
            "        \"product_publications\": [{" +
            "            \"id\": 2626498435," +
            "            \"product_id\": 2096063363," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"updated_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"body_html\": \"parsing the driver won't do anything, we need to calculate the online PNG program!\"," +
            "            \"handle\": \"actinian-fur-hat\"," +
            "            \"product_type\": \"enable bricks-and-clicks e-business\"," +
            "            \"title\": \"Actinian Fur Hat\"," +
            "            \"vendor\": \"McCullough Group\"," +
            "            \"published_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"\"," +
            "            \"images\": [{" +
            "                \"id\": 4277333187," +
            "                \"created_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"position\": 1," +
            "                \"updated_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"product_id\": 2096063363," +
            "                \"src\": \"https:\\\\/\\\\/cdn.shopify.com\\\\/s\\\\/files\\\\/1\\\\/0957\\\\/5792\\\\/products\\\\/Kraepelin3.gif?v=1439489564\"," +
            "                \"variant_ids\": []" +
            "            }]," +
            "            \"options\": [{" +
            "                \"id\": 2524801731," +
            "                \"name\": \"Color or something\"," +
            "                \"product_id\": 2096063363," +
            "                \"position\": 1" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 6030700419," +
            "                \"title\": \"Teal\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2524801731," +
            "                    \"name\": \"Color or something\"," +
            "                    \"value\": \"Teal\"" +
            "                }]," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 4000," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": false," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }]" +
            "        }]" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify91 =
            "{" +
            "    \"body\": {" +
            "        \"checkout\": {" +
            "            \"created_at\": \"2016-03-07T10:21:16-05:00\"," +
            "            \"currency\": \"CAD\"," +
            "            \"customer_id\": 1137418883," +
            "            \"email\": \"test@test.com\"," +
            "            \"location_id\": null," +
            "            \"order_id\": null," +
            "            \"requires_shipping\": true," +
            "            \"reservation_time\": 300," +
            "            \"source_name\": \"mobile_app\"," +
            "            \"source_identifier\": \"26915715\"," +
            "            \"source_url\": null," +
            "            \"taxes_included\": false," +
            "            \"token\": \"75b3d9ba4a2efeeabf888acd6d55102e\"," +
            "            \"updated_at\": \"2016-03-07T10:21:16-05:00\"," +
            "            \"payment_due\": \"2230.99\"," +
            "            \"payment_url\": \"https:\\\\/\\\\/elb.deposit.shopifycs.com\\\\/sessions\"," +
            "            \"reservation_time_left\": 300," +
            "            \"subtotal_price\": \"2230.99\"," +
            "            \"total_price\": \"2230.99\"," +
            "            \"total_tax\": \"0.00\"," +
            "            \"attributes\": []," +
            "            \"note\": \"\"," +
            "            \"order\": null," +
            "            \"order_status_url\": null," +
            "            \"privacy_policy_url\": null," +
            "            \"refund_policy_url\": null," +
            "            \"terms_of_service_url\": null," +
            "            \"user_id\": null," +
            "            \"web_url\": \"https:\\\\/\\\\/checkout.shopify.com\\\\/9575792\\\\/checkouts\\\\/75b3d9ba4a2efeeabf888acd6d55102e\"," +
            "            \"tax_lines\": []," +
            "            \"line_items\": [{" +
            "                \"id\": \"5c7fda2a8fda73ae\"," +
            "                \"product_id\": 2096063363," +
            "                \"variant_id\": 6030700419," +
            "                \"sku\": \"\"," +
            "                \"vendor\": \"McCullough Group\"," +
            "                \"title\": \"Actinian Fur Hat\"," +
            "                \"variant_title\": \"Teal\"," +
            "                \"taxable\": false," +
            "                \"requires_shipping\": true," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"line_price\": \"2230.99\"," +
            "                \"properties\": {" +
            "                    \"size\": \"large\"," +
            "                    \"color\": \"red\"" +
            "                }," +
            "                \"quantity\": 1," +
            "                \"grams\": 4000," +
            "                \"fulfillment_service\": \"manual\"," +
            "                \"applied_discounts\": []" +
            "            }]," +
            "            \"gift_cards\": []," +
            "            \"shipping_rate\": null," +
            "            \"shipping_address\": {" +
            "                \"id\": 3479866566," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"credit_card\": null," +
            "            \"billing_address\": {" +
            "                \"id\": 3479866502," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"discount\": null" +
            "        }" +
            "    }," +
            "    \"code\": 201," +
            "    \"message\": \"Created\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify92 =
            "{" +
            "    \"body\": {" +
            "        \"errors\": {" +
            "            \"gift_card\": {" +
            "                \"code\": [{" +
            "                    \"code\": \"gift_card_code_invalid\"," +
            "                    \"message\": \"Code is invalid\"," +
            "                    \"options\": {}" +
            "                }]" +
            "            }" +
            "        }" +
            "    }," +
            "    \"code\": 422," +
            "    \"message\": \"Unprocessable Entity\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify93 =
            "{" +
            "    \"body\": {" +
            "        \"product_publications\": [{" +
            "            \"id\": 2626498435," +
            "            \"product_id\": 2096063363," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"updated_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"body_html\": \"parsing the driver won't do anything, we need to calculate the online PNG program!\"," +
            "            \"handle\": \"actinian-fur-hat\"," +
            "            \"product_type\": \"enable bricks-and-clicks e-business\"," +
            "            \"title\": \"Actinian Fur Hat\"," +
            "            \"vendor\": \"McCullough Group\"," +
            "            \"published_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"\"," +
            "            \"images\": [{" +
            "                \"id\": 4277333187," +
            "                \"created_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"position\": 1," +
            "                \"updated_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"product_id\": 2096063363," +
            "                \"src\": \"https:\\\\/\\\\/cdn.shopify.com\\\\/s\\\\/files\\\\/1\\\\/0957\\\\/5792\\\\/products\\\\/Kraepelin3.gif?v=1439489564\"," +
            "                \"variant_ids\": []" +
            "            }]," +
            "            \"options\": [{" +
            "                \"id\": 2524801731," +
            "                \"name\": \"Color or something\"," +
            "                \"product_id\": 2096063363," +
            "                \"position\": 1" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 6030700419," +
            "                \"title\": \"Teal\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2524801731," +
            "                    \"name\": \"Color or something\"," +
            "                    \"value\": \"Teal\"" +
            "                }]," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 4000," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": false," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }]" +
            "        }]" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify94 =
            "{" +
            "    \"body\": {" +
            "        \"checkout\": {" +
            "            \"created_at\": \"2016-03-07T10:21:17-05:00\"," +
            "            \"currency\": \"CAD\"," +
            "            \"customer_id\": 1137418883," +
            "            \"email\": \"test@test.com\"," +
            "            \"location_id\": null," +
            "            \"order_id\": null," +
            "            \"requires_shipping\": true," +
            "            \"reservation_time\": 300," +
            "            \"source_name\": \"mobile_app\"," +
            "            \"source_identifier\": \"26915715\"," +
            "            \"source_url\": null," +
            "            \"taxes_included\": false," +
            "            \"token\": \"bf04204260c591214ca03b4da076a6bb\"," +
            "            \"updated_at\": \"2016-03-07T10:21:17-05:00\"," +
            "            \"payment_due\": \"2230.99\"," +
            "            \"payment_url\": \"https:\\\\/\\\\/elb.deposit.shopifycs.com\\\\/sessions\"," +
            "            \"reservation_time_left\": 300," +
            "            \"subtotal_price\": \"2230.99\"," +
            "            \"total_price\": \"2230.99\"," +
            "            \"total_tax\": \"0.00\"," +
            "            \"attributes\": []," +
            "            \"note\": \"\"," +
            "            \"order\": null," +
            "            \"order_status_url\": null," +
            "            \"privacy_policy_url\": null," +
            "            \"refund_policy_url\": null," +
            "            \"terms_of_service_url\": null," +
            "            \"user_id\": null," +
            "            \"web_url\": \"https:\\\\/\\\\/checkout.shopify.com\\\\/9575792\\\\/checkouts\\\\/bf04204260c591214ca03b4da076a6bb\"," +
            "            \"tax_lines\": []," +
            "            \"line_items\": [{" +
            "                \"id\": \"e67d115376a45f51\"," +
            "                \"product_id\": 2096063363," +
            "                \"variant_id\": 6030700419," +
            "                \"sku\": \"\"," +
            "                \"vendor\": \"McCullough Group\"," +
            "                \"title\": \"Actinian Fur Hat\"," +
            "                \"variant_title\": \"Teal\"," +
            "                \"taxable\": false," +
            "                \"requires_shipping\": true," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"line_price\": \"2230.99\"," +
            "                \"properties\": {" +
            "                    \"size\": \"large\"," +
            "                    \"color\": \"red\"" +
            "                }," +
            "                \"quantity\": 1," +
            "                \"grams\": 4000," +
            "                \"fulfillment_service\": \"manual\"," +
            "                \"applied_discounts\": []" +
            "            }]," +
            "            \"gift_cards\": []," +
            "            \"shipping_rate\": null," +
            "            \"shipping_address\": {" +
            "                \"id\": 3479866886," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"credit_card\": null," +
            "            \"billing_address\": {" +
            "                \"id\": 3479866822," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"discount\": null" +
            "        }" +
            "    }," +
            "    \"code\": 201," +
            "    \"message\": \"Created\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify95 =
            "{" +
            "    \"body\": {" +
            "        \"gift_card\": {" +
            "            \"id\": 9741702," +
            "            \"last_characters\": \"rd11\"," +
            "            \"balance\": \"11.00\"," +
            "            \"amount_used\": \"11.00\"," +
            "            \"checkout\": {" +
            "                \"payment_due\": \"2219.99\"" +
            "            }" +
            "        }" +
            "    }," +
            "    \"code\": 201," +
            "    \"message\": \"Created\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify96 =
            "{" +
            "    \"body\": {" +
            "        \"gift_card\": {" +
            "            \"id\": 9741766," +
            "            \"last_characters\": \"rd25\"," +
            "            \"balance\": \"25.00\"," +
            "            \"amount_used\": \"25.00\"," +
            "            \"checkout\": {" +
            "                \"payment_due\": \"2194.99\"" +
            "            }" +
            "        }" +
            "    }," +
            "    \"code\": 201," +
            "    \"message\": \"Created\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify97 =
            "{" +
            "    \"body\": {" +
            "        \"gift_card\": {" +
            "            \"id\": 9741830," +
            "            \"last_characters\": \"rd50\"," +
            "            \"balance\": \"50.00\"," +
            "            \"amount_used\": \"50.00\"," +
            "            \"checkout\": {" +
            "                \"payment_due\": \"2144.99\"" +
            "            }" +
            "        }" +
            "    }," +
            "    \"code\": 201," +
            "    \"message\": \"Created\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify98 =
            "{" +
            "    \"body\": {" +
            "        \"gift_card\": {" +
            "            \"id\": 9741766," +
            "            \"last_characters\": \"rd25\"," +
            "            \"balance\": \"25.00\"," +
            "            \"amount_used\": \"25.00\"," +
            "            \"checkout\": {" +
            "                \"payment_due\": \"2169.99\"" +
            "            }" +
            "        }" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify99 =
            "{" +
            "    \"body\": {" +
            "        \"product_publications\": [{" +
            "            \"id\": 2626498435," +
            "            \"product_id\": 2096063363," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"updated_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"body_html\": \"parsing the driver won't do anything, we need to calculate the online PNG program!\"," +
            "            \"handle\": \"actinian-fur-hat\"," +
            "            \"product_type\": \"enable bricks-and-clicks e-business\"," +
            "            \"title\": \"Actinian Fur Hat\"," +
            "            \"vendor\": \"McCullough Group\"," +
            "            \"published_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"\"," +
            "            \"images\": [{" +
            "                \"id\": 4277333187," +
            "                \"created_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"position\": 1," +
            "                \"updated_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"product_id\": 2096063363," +
            "                \"src\": \"https:\\\\/\\\\/cdn.shopify.com\\\\/s\\\\/files\\\\/1\\\\/0957\\\\/5792\\\\/products\\\\/Kraepelin3.gif?v=1439489564\"," +
            "                \"variant_ids\": []" +
            "            }]," +
            "            \"options\": [{" +
            "                \"id\": 2524801731," +
            "                \"name\": \"Color or something\"," +
            "                \"product_id\": 2096063363," +
            "                \"position\": 1" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 6030700419," +
            "                \"title\": \"Teal\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2524801731," +
            "                    \"name\": \"Color or something\"," +
            "                    \"value\": \"Teal\"" +
            "                }]," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 4000," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": false," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }]" +
            "        }]" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify100 =
            "{" +
            "    \"body\": {" +
            "        \"checkout\": {" +
            "            \"created_at\": \"2016-03-07T10:21:20-05:00\"," +
            "            \"currency\": \"CAD\"," +
            "            \"customer_id\": 1137418883," +
            "            \"email\": \"test@test.com\"," +
            "            \"location_id\": null," +
            "            \"order_id\": null," +
            "            \"requires_shipping\": true," +
            "            \"reservation_time\": 300," +
            "            \"source_name\": \"mobile_app\"," +
            "            \"source_identifier\": \"26915715\"," +
            "            \"source_url\": null," +
            "            \"taxes_included\": false," +
            "            \"token\": \"fcc2c28b7d7239910e36df147f478004\"," +
            "            \"updated_at\": \"2016-03-07T10:21:20-05:00\"," +
            "            \"payment_due\": \"2230.99\"," +
            "            \"payment_url\": \"https:\\\\/\\\\/elb.deposit.shopifycs.com\\\\/sessions\"," +
            "            \"reservation_time_left\": 300," +
            "            \"subtotal_price\": \"2230.99\"," +
            "            \"total_price\": \"2230.99\"," +
            "            \"total_tax\": \"0.00\"," +
            "            \"attributes\": []," +
            "            \"note\": \"\"," +
            "            \"order\": null," +
            "            \"order_status_url\": null," +
            "            \"privacy_policy_url\": null," +
            "            \"refund_policy_url\": null," +
            "            \"terms_of_service_url\": null," +
            "            \"user_id\": null," +
            "            \"web_url\": \"https:\\\\/\\\\/checkout.shopify.com\\\\/9575792\\\\/checkouts\\\\/fcc2c28b7d7239910e36df147f478004\"," +
            "            \"tax_lines\": []," +
            "            \"line_items\": [{" +
            "                \"id\": \"6b109a331e29a6ca\"," +
            "                \"product_id\": 2096063363," +
            "                \"variant_id\": 6030700419," +
            "                \"sku\": \"\"," +
            "                \"vendor\": \"McCullough Group\"," +
            "                \"title\": \"Actinian Fur Hat\"," +
            "                \"variant_title\": \"Teal\"," +
            "                \"taxable\": false," +
            "                \"requires_shipping\": true," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"line_price\": \"2230.99\"," +
            "                \"properties\": {" +
            "                    \"size\": \"large\"," +
            "                    \"color\": \"red\"" +
            "                }," +
            "                \"quantity\": 1," +
            "                \"grams\": 4000," +
            "                \"fulfillment_service\": \"manual\"," +
            "                \"applied_discounts\": []" +
            "            }]," +
            "            \"gift_cards\": []," +
            "            \"shipping_rate\": null," +
            "            \"shipping_address\": {" +
            "                \"id\": 3479867078," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"credit_card\": null," +
            "            \"billing_address\": {" +
            "                \"id\": 3479867014," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"discount\": null" +
            "        }" +
            "    }," +
            "    \"code\": 201," +
            "    \"message\": \"Created\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify101 =
            "{" +
            "    \"body\": {" +
            "        \"checkout\": {" +
            "            \"created_at\": \"2016-03-07T10:21:20-05:00\"," +
            "            \"currency\": \"CAD\"," +
            "            \"customer_id\": 1137418883," +
            "            \"email\": \"test@test.com\"," +
            "            \"location_id\": null," +
            "            \"order_id\": null," +
            "            \"requires_shipping\": true," +
            "            \"reservation_time\": 300," +
            "            \"source_name\": \"mobile_app\"," +
            "            \"source_identifier\": \"26915715\"," +
            "            \"source_url\": null," +
            "            \"taxes_included\": false," +
            "            \"token\": \"fcc2c28b7d7239910e36df147f478004\"," +
            "            \"updated_at\": \"2016-03-07T10:21:21-05:00\"," +
            "            \"payment_due\": \"2218.99\"," +
            "            \"payment_url\": \"https:\\\\/\\\\/elb.deposit.shopifycs.com\\\\/sessions\"," +
            "            \"reservation_time_left\": 300," +
            "            \"subtotal_price\": \"2218.99\"," +
            "            \"total_price\": \"2218.99\"," +
            "            \"total_tax\": \"0.00\"," +
            "            \"attributes\": []," +
            "            \"note\": \"\"," +
            "            \"order\": null," +
            "            \"order_status_url\": null," +
            "            \"privacy_policy_url\": null," +
            "            \"refund_policy_url\": null," +
            "            \"terms_of_service_url\": null," +
            "            \"user_id\": null," +
            "            \"web_url\": \"https:\\\\/\\\\/checkout.shopify.com\\\\/9575792\\\\/checkouts\\\\/fcc2c28b7d7239910e36df147f478004\"," +
            "            \"tax_lines\": []," +
            "            \"line_items\": [{" +
            "                \"id\": \"efc917a0fcc84426\"," +
            "                \"product_id\": 2096063363," +
            "                \"variant_id\": 6030700419," +
            "                \"sku\": \"\"," +
            "                \"vendor\": \"McCullough Group\"," +
            "                \"title\": \"Actinian Fur Hat\"," +
            "                \"variant_title\": \"Teal\"," +
            "                \"taxable\": false," +
            "                \"requires_shipping\": true," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"line_price\": \"2230.99\"," +
            "                \"properties\": {" +
            "                    \"size\": \"large\"," +
            "                    \"color\": \"red\"" +
            "                }," +
            "                \"quantity\": 1," +
            "                \"grams\": 4000," +
            "                \"fulfillment_service\": \"manual\"," +
            "                \"applied_discounts\": []" +
            "            }]," +
            "            \"gift_cards\": []," +
            "            \"shipping_rate\": null," +
            "            \"shipping_address\": {" +
            "                \"id\": 3479867078," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"credit_card\": null," +
            "            \"billing_address\": {" +
            "                \"id\": 3479867014," +
            "                \"first_name\": \"MobileBuy\"," +
            "                \"last_name\": \"TestBot\"," +
            "                \"phone\": \"1-555-555-5555\"," +
            "                \"company\": \"Shopify Inc.\"," +
            "                \"address1\": \"150 Elgin Street\"," +
            "                \"address2\": \"8th Floor\"," +
            "                \"city\": \"Ottawa\"," +
            "                \"province\": \"Ontario\"," +
            "                \"province_code\": \"ON\"," +
            "                \"country\": \"Canada\"," +
            "                \"country_code\": \"CA\"," +
            "                \"zip\": \"K1N5T5\"" +
            "            }," +
            "            \"discount\": {" +
            "                \"code\": \"12_dollar_discount\"," +
            "                \"amount\": \"12.00\"," +
            "                \"applicable\": true," +
            "                \"reason\": null" +
            "            }" +
            "        }" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify102 =
            "{" +
            "    \"body\": \"\"," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify103 =
            "{" +
            "    \"body\": {" +
            "        \"collection_publications\": [{" +
            "            \"id\": 171459075," +
            "            \"collection_id\": 109931075," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-08-19T09:47:00-04:00\"," +
            "            \"updated_at\": \"2015-08-19T15:43:26-04:00\"," +
            "            \"body_html\": \"\"," +
            "            \"handle\": \"frontpage\"," +
            "            \"image\": null," +
            "            \"title\": \"Frontpage\"," +
            "            \"published_at\": \"2015-08-19T09:47:00-04:00\"," +
            "            \"published\": true" +
            "        }]" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify104 =
            "{" +
            "    \"body\": {" +
            "        \"product_publications\": []" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify105 =
            "{" +
            "    \"body\": {" +
            "        \"product_publications\": []" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify106 =
            "{" +
            "    \"body\": {" +
            "        \"product_publications\": [{" +
            "            \"id\": 2626498435," +
            "            \"product_id\": 2096063363," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"updated_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"body_html\": \"parsing the driver won't do anything, we need to calculate the online PNG program!\"," +
            "            \"handle\": \"actinian-fur-hat\"," +
            "            \"product_type\": \"enable bricks-and-clicks e-business\"," +
            "            \"title\": \"Actinian Fur Hat\"," +
            "            \"vendor\": \"McCullough Group\"," +
            "            \"published_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"\"," +
            "            \"images\": [{" +
            "                \"id\": 4277333187," +
            "                \"created_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"position\": 1," +
            "                \"updated_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"product_id\": 2096063363," +
            "                \"src\": \"https:\\\\/\\\\/cdn.shopify.com\\\\/s\\\\/files\\\\/1\\\\/0957\\\\/5792\\\\/products\\\\/Kraepelin3.gif?v=1439489564\"," +
            "                \"variant_ids\": []" +
            "            }]," +
            "            \"options\": [{" +
            "                \"id\": 2524801731," +
            "                \"name\": \"Color or something\"," +
            "                \"product_id\": 2096063363," +
            "                \"position\": 1" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 6030700419," +
            "                \"title\": \"Teal\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2524801731," +
            "                    \"name\": \"Color or something\"," +
            "                    \"value\": \"Teal\"" +
            "                }]," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 4000," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": false," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }]" +
            "        }]" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify107 =
            "{" +
            "    \"body\": {" +
            "        \"product_publications\": [{" +
            "            \"id\": 3186044355," +
            "            \"product_id\": 2576257283," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-09-14T11:23:04-04:00\"," +
            "            \"updated_at\": \"2015-10-08T12:46:33-04:00\"," +
            "            \"body_html\": \"A shirt with lots of variants\"," +
            "            \"handle\": \"shirt\"," +
            "            \"product_type\": \"\"," +
            "            \"title\": \"Shirt\"," +
            "            \"vendor\": \"MobileBuySDKTestShop\"," +
            "            \"published_at\": \"2015-09-14T11:23:03-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"cotton, summer, Vintage\"," +
            "            \"images\": []," +
            "            \"options\": [{" +
            "                \"id\": 3098335939," +
            "                \"name\": \"Size\"," +
            "                \"product_id\": 2576257283," +
            "                \"position\": 1" +
            "            }, {" +
            "                \"id\": 3098336003," +
            "                \"name\": \"Neck\"," +
            "                \"product_id\": 2576257283," +
            "                \"position\": 2" +
            "            }, {" +
            "                \"id\": 3098336067," +
            "                \"name\": \"Color\"," +
            "                \"product_id\": 2576257283," +
            "                \"position\": 3" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 7522060675," +
            "                \"title\": \"Small \\\\/ V-Neck \\\\/ Blue\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Blue\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522060739," +
            "                \"title\": \"Small \\\\/ V-Neck \\\\/ Red\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Red\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 2," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522060867," +
            "                \"title\": \"Small \\\\/ V-Neck \\\\/ Green\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Green\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 3," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522061123," +
            "                \"title\": \"Small \\\\/ V-Neck \\\\/ Black\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Black\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 4," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522061315," +
            "                \"title\": \"Small \\\\/ V-Neck \\\\/ White\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"White\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 5," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522061635," +
            "                \"title\": \"Small \\\\/ Crew Neck \\\\/ Blue\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Blue\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 6," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522061891," +
            "                \"title\": \"Small \\\\/ Crew Neck \\\\/ Red\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Red\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 7," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522062147," +
            "                \"title\": \"Small \\\\/ Crew Neck \\\\/ Green\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Green\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 8," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522062339," +
            "                \"title\": \"Small \\\\/ Crew Neck \\\\/ Black\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Black\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 9," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522062531," +
            "                \"title\": \"Small \\\\/ Crew Neck \\\\/ White\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"White\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 10," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522062787," +
            "                \"title\": \"Medium \\\\/ V-Neck \\\\/ Blue\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Blue\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 11," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522063043," +
            "                \"title\": \"Medium \\\\/ V-Neck \\\\/ Red\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Red\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 12," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522063235," +
            "                \"title\": \"Medium \\\\/ V-Neck \\\\/ Green\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Green\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 13," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522063491," +
            "                \"title\": \"Medium \\\\/ V-Neck \\\\/ Black\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Black\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 14," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522063683," +
            "                \"title\": \"Medium \\\\/ V-Neck \\\\/ White\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"White\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 15," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522064003," +
            "                \"title\": \"Medium \\\\/ Crew Neck \\\\/ Blue\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Blue\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 16," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522064323," +
            "                \"title\": \"Medium \\\\/ Crew Neck \\\\/ Red\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Red\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 17," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522064643," +
            "                \"title\": \"Medium \\\\/ Crew Neck \\\\/ Green\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Green\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 18," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522065091," +
            "                \"title\": \"Medium \\\\/ Crew Neck \\\\/ Black\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Black\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 19," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522065475," +
            "                \"title\": \"Medium \\\\/ Crew Neck \\\\/ White\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"White\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 20," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522065731," +
            "                \"title\": \"Large \\\\/ V-Neck \\\\/ Blue\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Blue\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 21," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522066051," +
            "                \"title\": \"Large \\\\/ V-Neck \\\\/ Red\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Red\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 22," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522066435," +
            "                \"title\": \"Large \\\\/ V-Neck \\\\/ Green\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Green\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 23," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522066819," +
            "                \"title\": \"Large \\\\/ V-Neck \\\\/ Black\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Black\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 24," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522067203," +
            "                \"title\": \"Large \\\\/ V-Neck \\\\/ White\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"White\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 25," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522067523," +
            "                \"title\": \"Large \\\\/ Crew Neck \\\\/ Blue\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Blue\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 26," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522067843," +
            "                \"title\": \"Large \\\\/ Crew Neck \\\\/ Red\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Red\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 27," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522068099," +
            "                \"title\": \"Large \\\\/ Crew Neck \\\\/ Green\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Green\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 28," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522068483," +
            "                \"title\": \"Large \\\\/ Crew Neck \\\\/ Black\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Black\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 29," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522068739," +
            "                \"title\": \"Large \\\\/ Crew Neck \\\\/ White\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"White\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 30," +
            "                \"available\": true" +
            "            }]" +
            "        }, {" +
            "            \"id\": 2626498627," +
            "            \"product_id\": 2096060931," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"updated_at\": \"2015-09-22T16:16:50-04:00\"," +
            "            \"body_html\": \"copying the circuit won't do anything, we need to reboot the haptic XSS program!\"," +
            "            \"handle\": \"appetizing-vinyl-chair\"," +
            "            \"product_type\": \"evolve world-class e-services\"," +
            "            \"title\": \"Appetizing Vinyl Chair\"," +
            "            \"vendor\": \"Quigley-Miller\"," +
            "            \"published_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"\"," +
            "            \"images\": [{" +
            "                \"id\": 4277332099," +
            "                \"created_at\": \"2015-08-13T14:12:39-04:00\"," +
            "                \"position\": 1," +
            "                \"updated_at\": \"2015-08-13T14:12:39-04:00\"," +
            "                \"product_id\": 2096060931," +
            "                \"src\": \"https:\\\\/\\\\/cdn.shopify.com\\\\/s\\\\/files\\\\/1\\\\/0957\\\\/5792\\\\/products\\\\/003swinging-office-chair-dreamalittlebigger.jpeg?v=1439489559\"," +
            "                \"variant_ids\": []" +
            "            }]," +
            "            \"options\": [{" +
            "                \"id\": 2524799235," +
            "                \"name\": \"Color or something\"," +
            "                \"product_id\": 2096060931," +
            "                \"position\": 1" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 6030690627," +
            "                \"title\": \"Blue\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2524799235," +
            "                    \"name\": \"Color or something\"," +
            "                    \"value\": \"Blue\"" +
            "                }]," +
            "                \"price\": \"2172.99\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 3000," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }]" +
            "        }, {" +
            "            \"id\": 2626499075," +
            "            \"product_id\": 2169155971," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"updated_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"body_html\": \"\\\\u003cp\\\\u003eShopping for someone else but not sure what to give them?\\\\nGive them the gift of choice with a %{shop_name} Gift Card.\\\\u003c\\\\/p\\\\u003e\\\\n\\\\n\\\\u003cp\\\\u003eGift cards are delivered by email and contain instructions to redeem them at checkout.\\\\nOur gift cards have no additional processing fees.\\\\u003c\\\\/p\\\\u003e\\\\n\"," +
            "            \"handle\": \"gift-card\"," +
            "            \"product_type\": \"Gift Card\"," +
            "            \"title\": \"Gift Card\"," +
            "            \"vendor\": \"MobileBuySDKTestShop\"," +
            "            \"published_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"\"," +
            "            \"images\": [{" +
            "                \"id\": 4415697027," +
            "                \"created_at\": \"2015-08-18T13:11:42-04:00\"," +
            "                \"position\": 1," +
            "                \"updated_at\": \"2015-08-18T13:11:42-04:00\"," +
            "                \"product_id\": 2169155971," +
            "                \"src\": \"https:\\\\/\\\\/cdn.shopify.com\\\\/s\\\\/files\\\\/1\\\\/0957\\\\/5792\\\\/products\\\\/e38bd83af578077b65a31424bd24d085.png?v=1439917902\"," +
            "                \"variant_ids\": []" +
            "            }]," +
            "            \"options\": [{" +
            "                \"id\": 2612744387," +
            "                \"name\": \"Title\"," +
            "                \"product_id\": 2169155971," +
            "                \"position\": 1" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 6212967363," +
            "                \"title\": \"$10.00\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2612744387," +
            "                    \"name\": \"Title\"," +
            "                    \"value\": \"$10.00\"" +
            "                }]," +
            "                \"price\": \"10.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": false," +
            "                \"sku\": \"\"," +
            "                \"taxable\": false," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 6212967427," +
            "                \"title\": \"$25.00\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2612744387," +
            "                    \"name\": \"Title\"," +
            "                    \"value\": \"$25.00\"" +
            "                }]," +
            "                \"price\": \"25.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": false," +
            "                \"sku\": \"\"," +
            "                \"taxable\": false," +
            "                \"position\": 2," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 6212967491," +
            "                \"title\": \"$50.00\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2612744387," +
            "                    \"name\": \"Title\"," +
            "                    \"value\": \"$50.00\"" +
            "                }]," +
            "                \"price\": \"50.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": false," +
            "                \"sku\": \"\"," +
            "                \"taxable\": false," +
            "                \"position\": 3," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 6212967555," +
            "                \"title\": \"$100.00\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2612744387," +
            "                    \"name\": \"Title\"," +
            "                    \"value\": \"$100.00\"" +
            "                }]," +
            "                \"price\": \"100.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": false," +
            "                \"sku\": \"\"," +
            "                \"taxable\": false," +
            "                \"position\": 4," +
            "                \"available\": true" +
            "            }]" +
            "        }, {" +
            "            \"id\": 2626499011," +
            "            \"product_id\": 2096062659," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"updated_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"body_html\": \"Use the back-end SSL protocol, then you can connect the primary circuit!\"," +
            "            \"handle\": \"circumstantial-concrete-coat\"," +
            "            \"product_type\": \"transition collaborative networks\"," +
            "            \"title\": \"Circumstantial Concrete Coat\"," +
            "            \"vendor\": \"Wisoky LLC\"," +
            "            \"published_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"\"," +
            "            \"images\": [{" +
            "                \"id\": 4277332675," +
            "                \"created_at\": \"2015-08-13T14:12:42-04:00\"," +
            "                \"position\": 1," +
            "                \"updated_at\": \"2015-08-13T14:12:42-04:00\"," +
            "                \"product_id\": 2096062659," +
            "                \"src\": \"https:\\\\/\\\\/cdn.shopify.com\\\\/s\\\\/files\\\\/1\\\\/0957\\\\/5792\\\\/products\\\\/FV1G6XCI7HG784C.LARGE.jpeg?v=1439489562\"," +
            "                \"variant_ids\": []" +
            "            }]," +
            "            \"options\": [{" +
            "                \"id\": 2524800963," +
            "                \"name\": \"Color or something\"," +
            "                \"product_id\": 2096062659," +
            "                \"position\": 1" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 6030696323," +
            "                \"title\": \"Red\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2524800963," +
            "                    \"name\": \"Color or something\"," +
            "                    \"value\": \"Red\"" +
            "                }]," +
            "                \"price\": \"1361.99\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 1000," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }]" +
            "        }, {" +
            "            \"id\": 2626498947," +
            "            \"product_id\": 2096064259," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"updated_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"body_html\": \"transmitting the program won't do anything, we need to navigate the redundant SAS circuit!\"," +
            "            \"handle\": \"circumambient-granite-shirt\"," +
            "            \"product_type\": \"enable cutting-edge metrics\"," +
            "            \"title\": \"Circumambient Granite Shirt\"," +
            "            \"vendor\": \"Bradtke, Collins and Beahan\"," +
            "            \"published_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"\"," +
            "            \"images\": []," +
            "            \"options\": [{" +
            "                \"id\": 2524802691," +
            "                \"name\": \"Color or something\"," +
            "                \"product_id\": 2096064259," +
            "                \"position\": 1" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 6030703235," +
            "                \"title\": \"Plum\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2524802691," +
            "                    \"name\": \"Color or something\"," +
            "                    \"value\": \"Plum\"" +
            "                }]," +
            "                \"price\": \"1096.99\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 1000," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }]" +
            "        }, {" +
            "            \"id\": 2626498883," +
            "            \"product_id\": 2096055043," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"updated_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"body_html\": \"You can't override the program without calculating the wireless JSON interface!\"," +
            "            \"handle\": \"chipped-plastic-microphone\"," +
            "            \"product_type\": \"utilize 24\\\\/365 e-business\"," +
            "            \"title\": \"Chipped Plastic Microphone\"," +
            "            \"vendor\": \"Lind and Sons\"," +
            "            \"published_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"\"," +
            "            \"images\": [{" +
            "                \"id\": 4277329219," +
            "                \"created_at\": \"2015-08-13T14:12:30-04:00\"," +
            "                \"position\": 1," +
            "                \"updated_at\": \"2015-08-13T14:12:30-04:00\"," +
            "                \"product_id\": 2096055043," +
            "                \"src\": \"https:\\\\/\\\\/cdn.shopify.com\\\\/s\\\\/files\\\\/1\\\\/0957\\\\/5792\\\\/products\\\\/384881_20140820115947.jpeg?v=1439489550\"," +
            "                \"variant_ids\": []" +
            "            }]," +
            "            \"options\": [{" +
            "                \"id\": 2524793283," +
            "                \"name\": \"Color or something\"," +
            "                \"product_id\": 2096055043," +
            "                \"position\": 1" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 6030677699," +
            "                \"title\": \"Orchid\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2524793283," +
            "                    \"name\": \"Color or something\"," +
            "                    \"value\": \"Orchid\"" +
            "                }]," +
            "                \"price\": \"2779.99\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 7000," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }]" +
            "        }, {" +
            "            \"id\": 2626498819," +
            "            \"product_id\": 2096057987," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"updated_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"body_html\": \"I'll index the digital SCSI card, that should program the CSS bus!\"," +
            "            \"handle\": \"cauliform-concrete-tablet\"," +
            "            \"product_type\": \"brand visionary networks\"," +
            "            \"title\": \"Cauliform Concrete Tablet\"," +
            "            \"vendor\": \"Price and Sons\"," +
            "            \"published_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"\"," +
            "            \"images\": [{" +
            "                \"id\": 4277330819," +
            "                \"created_at\": \"2015-08-13T14:12:35-04:00\"," +
            "                \"position\": 1," +
            "                \"updated_at\": \"2015-08-13T14:12:35-04:00\"," +
            "                \"product_id\": 2096057987," +
            "                \"src\": \"https:\\\\/\\\\/cdn.shopify.com\\\\/s\\\\/files\\\\/1\\\\/0957\\\\/5792\\\\/products\\\\/img_2899.jpeg?v=1439489555\"," +
            "                \"variant_ids\": []" +
            "            }]," +
            "            \"options\": [{" +
            "                \"id\": 2524796227," +
            "                \"name\": \"Color or something\"," +
            "                \"product_id\": 2096057987," +
            "                \"position\": 1" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 6030684227," +
            "                \"title\": \"Tan\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2524796227," +
            "                    \"name\": \"Color or something\"," +
            "                    \"value\": \"Tan\"" +
            "                }]," +
            "                \"price\": \"1855.99\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 2000," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }]" +
            "        }, {" +
            "            \"id\": 2626498755," +
            "            \"product_id\": 2096065731," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"updated_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"body_html\": \"We need to input the auxiliary GB transmitter!\"," +
            "            \"handle\": \"caprylic-steel-wire\"," +
            "            \"product_type\": \"enhance extensible architectures\"," +
            "            \"title\": \"Caprylic Steel Wire\"," +
            "            \"vendor\": \"Ankunding, Wilkinson and McClure\"," +
            "            \"published_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"\"," +
            "            \"images\": [{" +
            "                \"id\": 4277334915," +
            "                \"created_at\": \"2015-08-13T14:12:48-04:00\"," +
            "                \"position\": 1," +
            "                \"updated_at\": \"2015-08-13T14:12:48-04:00\"," +
            "                \"product_id\": 2096065731," +
            "                \"src\": \"https:\\\\/\\\\/cdn.shopify.com\\\\/s\\\\/files\\\\/1\\\\/0957\\\\/5792\\\\/products\\\\/2441478_orig.jpeg?v=1439489568\"," +
            "                \"variant_ids\": []" +
            "            }]," +
            "            \"options\": [{" +
            "                \"id\": 2524804163," +
            "                \"name\": \"Color or something\"," +
            "                \"product_id\": 2096065731," +
            "                \"position\": 1" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 6030708355," +
            "                \"title\": \"Turquoise\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2524804163," +
            "                    \"name\": \"Color or something\"," +
            "                    \"value\": \"Turquoise\"" +
            "                }]," +
            "                \"price\": \"948.99\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 6000," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }]" +
            "        }, {" +
            "            \"id\": 2626498691," +
            "            \"product_id\": 2096059715," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"updated_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"body_html\": \"I'll back up the online SSL interface, that should sensor the SDD bus!\"," +
            "            \"handle\": \"asking-pine-ipad\"," +
            "            \"product_type\": \"scale revolutionary convergence\"," +
            "            \"title\": \"Asking Pine iPad\"," +
            "            \"vendor\": \"Nader-Stamm\"," +
            "            \"published_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"\"," +
            "            \"images\": [{" +
            "                \"id\": 4277331331," +
            "                \"created_at\": \"2015-08-13T14:12:37-04:00\"," +
            "                \"position\": 1," +
            "                \"updated_at\": \"2015-08-13T14:12:37-04:00\"," +
            "                \"product_id\": 2096059715," +
            "                \"src\": \"https:\\\\/\\\\/cdn.shopify.com\\\\/s\\\\/files\\\\/1\\\\/0957\\\\/5792\\\\/products\\\\/09proto-span-superJumbo.jpeg?v=1439489557\"," +
            "                \"variant_ids\": []" +
            "            }]," +
            "            \"options\": [{" +
            "                \"id\": 2524798019," +
            "                \"name\": \"Color or something\"," +
            "                \"product_id\": 2096059715," +
            "                \"position\": 1" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 6030688003," +
            "                \"title\": \"Yellow\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2524798019," +
            "                    \"name\": \"Color or something\"," +
            "                    \"value\": \"Yellow\"" +
            "                }]," +
            "                \"price\": \"1484.99\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 4000," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }]" +
            "        }, {" +
            "            \"id\": 2626498563," +
            "            \"product_id\": 2096064899," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"updated_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"body_html\": \"The THX monitor is down, hack the primary driver so we can quantify the JSON protocol!\"," +
            "            \"handle\": \"animal-cotton-camera\"," +
            "            \"product_type\": \"drive sticky eyeballs\"," +
            "            \"title\": \"Animal Cotton Camera\"," +
            "            \"vendor\": \"Dickinson Inc\"," +
            "            \"published_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"\"," +
            "            \"images\": [{" +
            "                \"id\": 4277334211," +
            "                \"created_at\": \"2015-08-13T14:12:46-04:00\"," +
            "                \"position\": 1," +
            "                \"updated_at\": \"2015-08-13T14:12:46-04:00\"," +
            "                \"product_id\": 2096064899," +
            "                \"src\": \"https:\\\\/\\\\/cdn.shopify.com\\\\/s\\\\/files\\\\/1\\\\/0957\\\\/5792\\\\/products\\\\/2014-Rushed-Pp-Cotton-3-Years-Old-Figure-Statue-Bear-Unisex-New-Fashion-Big-Eyes-Head.jpeg?v=1439489566\"," +
            "                \"variant_ids\": []" +
            "            }]," +
            "            \"options\": [{" +
            "                \"id\": 2524803331," +
            "                \"name\": \"Color or something\"," +
            "                \"product_id\": 2096064899," +
            "                \"position\": 1" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 6030705347," +
            "                \"title\": \"Indigo\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2524803331," +
            "                    \"name\": \"Color or something\"," +
            "                    \"value\": \"Indigo\"" +
            "                }]," +
            "                \"price\": \"2327.99\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 8000," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }]" +
            "        }, {" +
            "            \"id\": 2626498499," +
            "            \"product_id\": 2096062275," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"updated_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"body_html\": \"Use the primary SMS array, then you can program the bluetooth bandwidth!\"," +
            "            \"handle\": \"ambisexual-glass-camera\"," +
            "            \"product_type\": \"mesh cutting-edge interfaces\"," +
            "            \"title\": \"Ambisexual Glass Camera\"," +
            "            \"vendor\": \"Borer, Zemlak and Reichert\"," +
            "            \"published_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"\"," +
            "            \"images\": []," +
            "            \"options\": [{" +
            "                \"id\": 2524800579," +
            "                \"name\": \"Color or something\"," +
            "                \"product_id\": 2096062275," +
            "                \"position\": 1" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 6030694595," +
            "                \"title\": \"Tan\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2524800579," +
            "                    \"name\": \"Color or something\"," +
            "                    \"value\": \"Tan\"" +
            "                }]," +
            "                \"price\": \"2629.99\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 4000," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }]" +
            "        }, {" +
            "            \"id\": 2626498435," +
            "            \"product_id\": 2096063363," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"updated_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"body_html\": \"parsing the driver won't do anything, we need to calculate the online PNG program!\"," +
            "            \"handle\": \"actinian-fur-hat\"," +
            "            \"product_type\": \"enable bricks-and-clicks e-business\"," +
            "            \"title\": \"Actinian Fur Hat\"," +
            "            \"vendor\": \"McCullough Group\"," +
            "            \"published_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"\"," +
            "            \"images\": [{" +
            "                \"id\": 4277333187," +
            "                \"created_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"position\": 1," +
            "                \"updated_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"product_id\": 2096063363," +
            "                \"src\": \"https:\\\\/\\\\/cdn.shopify.com\\\\/s\\\\/files\\\\/1\\\\/0957\\\\/5792\\\\/products\\\\/Kraepelin3.gif?v=1439489564\"," +
            "                \"variant_ids\": []" +
            "            }]," +
            "            \"options\": [{" +
            "                \"id\": 2524801731," +
            "                \"name\": \"Color or something\"," +
            "                \"product_id\": 2096063363," +
            "                \"position\": 1" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 6030700419," +
            "                \"title\": \"Teal\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2524801731," +
            "                    \"name\": \"Color or something\"," +
            "                    \"value\": \"Teal\"" +
            "                }]," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 4000," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": false," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }]" +
            "        }]" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify108 =
            "{" +
            "    \"body\": {" +
            "        \"product_publications\": [{" +
            "            \"id\": 3186044355," +
            "            \"product_id\": 2576257283," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-09-14T11:23:04-04:00\"," +
            "            \"updated_at\": \"2015-10-08T12:46:33-04:00\"," +
            "            \"body_html\": \"A shirt with lots of variants\"," +
            "            \"handle\": \"shirt\"," +
            "            \"product_type\": \"\"," +
            "            \"title\": \"Shirt\"," +
            "            \"vendor\": \"MobileBuySDKTestShop\"," +
            "            \"published_at\": \"2015-09-14T11:23:03-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"cotton, summer, Vintage\"," +
            "            \"images\": []," +
            "            \"options\": [{" +
            "                \"id\": 3098335939," +
            "                \"name\": \"Size\"," +
            "                \"product_id\": 2576257283," +
            "                \"position\": 1" +
            "            }, {" +
            "                \"id\": 3098336003," +
            "                \"name\": \"Neck\"," +
            "                \"product_id\": 2576257283," +
            "                \"position\": 2" +
            "            }, {" +
            "                \"id\": 3098336067," +
            "                \"name\": \"Color\"," +
            "                \"product_id\": 2576257283," +
            "                \"position\": 3" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 7522060675," +
            "                \"title\": \"Small \\\\/ V-Neck \\\\/ Blue\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Blue\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522060739," +
            "                \"title\": \"Small \\\\/ V-Neck \\\\/ Red\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Red\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 2," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522060867," +
            "                \"title\": \"Small \\\\/ V-Neck \\\\/ Green\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Green\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 3," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522061123," +
            "                \"title\": \"Small \\\\/ V-Neck \\\\/ Black\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Black\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 4," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522061315," +
            "                \"title\": \"Small \\\\/ V-Neck \\\\/ White\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"White\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 5," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522061635," +
            "                \"title\": \"Small \\\\/ Crew Neck \\\\/ Blue\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Blue\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 6," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522061891," +
            "                \"title\": \"Small \\\\/ Crew Neck \\\\/ Red\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Red\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 7," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522062147," +
            "                \"title\": \"Small \\\\/ Crew Neck \\\\/ Green\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Green\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 8," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522062339," +
            "                \"title\": \"Small \\\\/ Crew Neck \\\\/ Black\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Black\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 9," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522062531," +
            "                \"title\": \"Small \\\\/ Crew Neck \\\\/ White\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Small\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"White\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 10," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522062787," +
            "                \"title\": \"Medium \\\\/ V-Neck \\\\/ Blue\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Blue\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 11," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522063043," +
            "                \"title\": \"Medium \\\\/ V-Neck \\\\/ Red\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Red\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 12," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522063235," +
            "                \"title\": \"Medium \\\\/ V-Neck \\\\/ Green\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Green\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 13," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522063491," +
            "                \"title\": \"Medium \\\\/ V-Neck \\\\/ Black\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Black\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 14," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522063683," +
            "                \"title\": \"Medium \\\\/ V-Neck \\\\/ White\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"White\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 15," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522064003," +
            "                \"title\": \"Medium \\\\/ Crew Neck \\\\/ Blue\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Blue\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 16," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522064323," +
            "                \"title\": \"Medium \\\\/ Crew Neck \\\\/ Red\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Red\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 17," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522064643," +
            "                \"title\": \"Medium \\\\/ Crew Neck \\\\/ Green\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Green\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 18," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522065091," +
            "                \"title\": \"Medium \\\\/ Crew Neck \\\\/ Black\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Black\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 19," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522065475," +
            "                \"title\": \"Medium \\\\/ Crew Neck \\\\/ White\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Medium\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"White\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 20," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522065731," +
            "                \"title\": \"Large \\\\/ V-Neck \\\\/ Blue\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Blue\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 21," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522066051," +
            "                \"title\": \"Large \\\\/ V-Neck \\\\/ Red\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Red\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 22," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522066435," +
            "                \"title\": \"Large \\\\/ V-Neck \\\\/ Green\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Green\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 23," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522066819," +
            "                \"title\": \"Large \\\\/ V-Neck \\\\/ Black\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Black\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 24," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522067203," +
            "                \"title\": \"Large \\\\/ V-Neck \\\\/ White\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"V-Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"White\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 25," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522067523," +
            "                \"title\": \"Large \\\\/ Crew Neck \\\\/ Blue\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Blue\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 26," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522067843," +
            "                \"title\": \"Large \\\\/ Crew Neck \\\\/ Red\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Red\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 27," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522068099," +
            "                \"title\": \"Large \\\\/ Crew Neck \\\\/ Green\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Green\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 28," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522068483," +
            "                \"title\": \"Large \\\\/ Crew Neck \\\\/ Black\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"Black\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 29," +
            "                \"available\": true" +
            "            }, {" +
            "                \"id\": 7522068739," +
            "                \"title\": \"Large \\\\/ Crew Neck \\\\/ White\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 3098335939," +
            "                    \"name\": \"Size\"," +
            "                    \"value\": \"Large\"" +
            "                }, {" +
            "                    \"option_id\": 3098336003," +
            "                    \"name\": \"Neck\"," +
            "                    \"value\": \"Crew Neck\"" +
            "                }, {" +
            "                    \"option_id\": 3098336067," +
            "                    \"name\": \"Color\"," +
            "                    \"value\": \"White\"" +
            "                }]," +
            "                \"price\": \"42.00\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 0," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 30," +
            "                \"available\": true" +
            "            }]" +
            "        }, {" +
            "            \"id\": 2626498435," +
            "            \"product_id\": 2096063363," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"updated_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"body_html\": \"parsing the driver won't do anything, we need to calculate the online PNG program!\"," +
            "            \"handle\": \"actinian-fur-hat\"," +
            "            \"product_type\": \"enable bricks-and-clicks e-business\"," +
            "            \"title\": \"Actinian Fur Hat\"," +
            "            \"vendor\": \"McCullough Group\"," +
            "            \"published_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"\"," +
            "            \"images\": [{" +
            "                \"id\": 4277333187," +
            "                \"created_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"position\": 1," +
            "                \"updated_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"product_id\": 2096063363," +
            "                \"src\": \"https:\\\\/\\\\/cdn.shopify.com\\\\/s\\\\/files\\\\/1\\\\/0957\\\\/5792\\\\/products\\\\/Kraepelin3.gif?v=1439489564\"," +
            "                \"variant_ids\": []" +
            "            }]," +
            "            \"options\": [{" +
            "                \"id\": 2524801731," +
            "                \"name\": \"Color or something\"," +
            "                \"product_id\": 2096063363," +
            "                \"position\": 1" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 6030700419," +
            "                \"title\": \"Teal\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2524801731," +
            "                    \"name\": \"Color or something\"," +
            "                    \"value\": \"Teal\"" +
            "                }]," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 4000," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": false," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }]" +
            "        }]" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify109 =
            "{" +
            "    \"body\": {" +
            "        \"product_publications\": [{" +
            "            \"id\": 2626498883," +
            "            \"product_id\": 2096055043," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"updated_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"body_html\": \"You can't override the program without calculating the wireless JSON interface!\"," +
            "            \"handle\": \"chipped-plastic-microphone\"," +
            "            \"product_type\": \"utilize 24\\\\/365 e-business\"," +
            "            \"title\": \"Chipped Plastic Microphone\"," +
            "            \"vendor\": \"Lind and Sons\"," +
            "            \"published_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"\"," +
            "            \"images\": [{" +
            "                \"id\": 4277329219," +
            "                \"created_at\": \"2015-08-13T14:12:30-04:00\"," +
            "                \"position\": 1," +
            "                \"updated_at\": \"2015-08-13T14:12:30-04:00\"," +
            "                \"product_id\": 2096055043," +
            "                \"src\": \"https:\\\\/\\\\/cdn.shopify.com\\\\/s\\\\/files\\\\/1\\\\/0957\\\\/5792\\\\/products\\\\/384881_20140820115947.jpeg?v=1439489550\"," +
            "                \"variant_ids\": []" +
            "            }]," +
            "            \"options\": [{" +
            "                \"id\": 2524793283," +
            "                \"name\": \"Color or something\"," +
            "                \"product_id\": 2096055043," +
            "                \"position\": 1" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 6030677699," +
            "                \"title\": \"Orchid\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2524793283," +
            "                    \"name\": \"Color or something\"," +
            "                    \"value\": \"Orchid\"" +
            "                }]," +
            "                \"price\": \"2779.99\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 7000," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }]" +
            "        }, {" +
            "            \"id\": 2626498819," +
            "            \"product_id\": 2096057987," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"updated_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"body_html\": \"I'll index the digital SCSI card, that should program the CSS bus!\"," +
            "            \"handle\": \"cauliform-concrete-tablet\"," +
            "            \"product_type\": \"brand visionary networks\"," +
            "            \"title\": \"Cauliform Concrete Tablet\"," +
            "            \"vendor\": \"Price and Sons\"," +
            "            \"published_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"\"," +
            "            \"images\": [{" +
            "                \"id\": 4277330819," +
            "                \"created_at\": \"2015-08-13T14:12:35-04:00\"," +
            "                \"position\": 1," +
            "                \"updated_at\": \"2015-08-13T14:12:35-04:00\"," +
            "                \"product_id\": 2096057987," +
            "                \"src\": \"https:\\\\/\\\\/cdn.shopify.com\\\\/s\\\\/files\\\\/1\\\\/0957\\\\/5792\\\\/products\\\\/img_2899.jpeg?v=1439489555\"," +
            "                \"variant_ids\": []" +
            "            }]," +
            "            \"options\": [{" +
            "                \"id\": 2524796227," +
            "                \"name\": \"Color or something\"," +
            "                \"product_id\": 2096057987," +
            "                \"position\": 1" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 6030684227," +
            "                \"title\": \"Tan\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2524796227," +
            "                    \"name\": \"Color or something\"," +
            "                    \"value\": \"Tan\"" +
            "                }]," +
            "                \"price\": \"1855.99\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 2000," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }]" +
            "        }, {" +
            "            \"id\": 2626498691," +
            "            \"product_id\": 2096059715," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"updated_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"body_html\": \"I'll back up the online SSL interface, that should sensor the SDD bus!\"," +
            "            \"handle\": \"asking-pine-ipad\"," +
            "            \"product_type\": \"scale revolutionary convergence\"," +
            "            \"title\": \"Asking Pine iPad\"," +
            "            \"vendor\": \"Nader-Stamm\"," +
            "            \"published_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"\"," +
            "            \"images\": [{" +
            "                \"id\": 4277331331," +
            "                \"created_at\": \"2015-08-13T14:12:37-04:00\"," +
            "                \"position\": 1," +
            "                \"updated_at\": \"2015-08-13T14:12:37-04:00\"," +
            "                \"product_id\": 2096059715," +
            "                \"src\": \"https:\\\\/\\\\/cdn.shopify.com\\\\/s\\\\/files\\\\/1\\\\/0957\\\\/5792\\\\/products\\\\/09proto-span-superJumbo.jpeg?v=1439489557\"," +
            "                \"variant_ids\": []" +
            "            }]," +
            "            \"options\": [{" +
            "                \"id\": 2524798019," +
            "                \"name\": \"Color or something\"," +
            "                \"product_id\": 2096059715," +
            "                \"position\": 1" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 6030688003," +
            "                \"title\": \"Yellow\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2524798019," +
            "                    \"name\": \"Color or something\"," +
            "                    \"value\": \"Yellow\"" +
            "                }]," +
            "                \"price\": \"1484.99\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 4000," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }]" +
            "        }, {" +
            "            \"id\": 2626498755," +
            "            \"product_id\": 2096065731," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"updated_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"body_html\": \"We need to input the auxiliary GB transmitter!\"," +
            "            \"handle\": \"caprylic-steel-wire\"," +
            "            \"product_type\": \"enhance extensible architectures\"," +
            "            \"title\": \"Caprylic Steel Wire\"," +
            "            \"vendor\": \"Ankunding, Wilkinson and McClure\"," +
            "            \"published_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"\"," +
            "            \"images\": [{" +
            "                \"id\": 4277334915," +
            "                \"created_at\": \"2015-08-13T14:12:48-04:00\"," +
            "                \"position\": 1," +
            "                \"updated_at\": \"2015-08-13T14:12:48-04:00\"," +
            "                \"product_id\": 2096065731," +
            "                \"src\": \"https:\\\\/\\\\/cdn.shopify.com\\\\/s\\\\/files\\\\/1\\\\/0957\\\\/5792\\\\/products\\\\/2441478_orig.jpeg?v=1439489568\"," +
            "                \"variant_ids\": []" +
            "            }]," +
            "            \"options\": [{" +
            "                \"id\": 2524804163," +
            "                \"name\": \"Color or something\"," +
            "                \"product_id\": 2096065731," +
            "                \"position\": 1" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 6030708355," +
            "                \"title\": \"Turquoise\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2524804163," +
            "                    \"name\": \"Color or something\"," +
            "                    \"value\": \"Turquoise\"" +
            "                }]," +
            "                \"price\": \"948.99\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 6000," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": true," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }]" +
            "        }]" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify110 =
            "{" +
            "    \"body\": {" +
            "        \"product_publications\": [{" +
            "            \"id\": 2626498435," +
            "            \"product_id\": 2096063363," +
            "            \"channel_id\": 26915715," +
            "            \"created_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"updated_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"body_html\": \"parsing the driver won't do anything, we need to calculate the online PNG program!\"," +
            "            \"handle\": \"actinian-fur-hat\"," +
            "            \"product_type\": \"enable bricks-and-clicks e-business\"," +
            "            \"title\": \"Actinian Fur Hat\"," +
            "            \"vendor\": \"McCullough Group\"," +
            "            \"published_at\": \"2015-08-19T09:47:37-04:00\"," +
            "            \"published\": true," +
            "            \"available\": true," +
            "            \"tags\": \"\"," +
            "            \"images\": [{" +
            "                \"id\": 4277333187," +
            "                \"created_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"position\": 1," +
            "                \"updated_at\": \"2015-08-13T14:12:44-04:00\"," +
            "                \"product_id\": 2096063363," +
            "                \"src\": \"https:\\\\/\\\\/cdn.shopify.com\\\\/s\\\\/files\\\\/1\\\\/0957\\\\/5792\\\\/products\\\\/Kraepelin3.gif?v=1439489564\"," +
            "                \"variant_ids\": []" +
            "            }]," +
            "            \"options\": [{" +
            "                \"id\": 2524801731," +
            "                \"name\": \"Color or something\"," +
            "                \"product_id\": 2096063363," +
            "                \"position\": 1" +
            "            }]," +
            "            \"variants\": [{" +
            "                \"id\": 6030700419," +
            "                \"title\": \"Teal\"," +
            "                \"option_values\": [{" +
            "                    \"option_id\": 2524801731," +
            "                    \"name\": \"Color or something\"," +
            "                    \"value\": \"Teal\"" +
            "                }]," +
            "                \"price\": \"2230.99\"," +
            "                \"compare_at_price\": null," +
            "                \"grams\": 4000," +
            "                \"requires_shipping\": true," +
            "                \"sku\": \"\"," +
            "                \"taxable\": false," +
            "                \"position\": 1," +
            "                \"available\": true" +
            "            }]" +
            "        }]" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";

    @Jsonify(ignoreBeginsWith = {"Test", "Shopify", "Body"})
    public static final String shopify111 =
            "{" +
            "    \"body\": {" +
            "        \"id\": 9575792," +
            "        \"name\": \"MobileBuySDKTestShop\"," +
            "        \"city\": \"Richmond Hill\"," +
            "        \"province\": \"Ontario\"," +
            "        \"country\": \"CA\"," +
            "        \"currency\": \"CAD\"," +
            "        \"domain\": \"mobilebuysdktestshop.myshopify.com\"," +
            "        \"url\": \"http:\\\\/\\\\/mobilebuysdktestshop.myshopify.com\"," +
            "        \"myshopify_domain\": \"mobilebuysdktestshop.myshopify.com\"," +
            "        \"description\": \"\"," +
            "        \"ships_to_countries\": [\"*\", \"CA\"]," +
            "        \"money_format\": \"${{amount}}\"," +
            "        \"published_collections_count\": 1," +
            "        \"published_products_count\": 11" +
            "    }," +
            "    \"code\": 200," +
            "    \"message\": \"OK\"" +
            "}";
}
