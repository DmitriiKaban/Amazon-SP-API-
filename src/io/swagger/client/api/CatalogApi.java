/*
 * Selling Partner API for Catalog Items
 * The Selling Partner API for Catalog Items provides programmatic access to information about items in the Amazon catalog.  For more information, refer to the [Catalog Items API Use Case Guide](doc:catalog-items-api-v2022-04-01-use-case-guide).
 *
 * OpenAPI spec version: 2022-04-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;
import io.swagger.client.StringUtil;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import io.swagger.client.model.catalogitems.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazon.SellingPartnerAPIAA.LWAAccessTokenCache;
import com.amazon.SellingPartnerAPIAA.LWAAccessTokenCacheImpl;
import com.amazon.SellingPartnerAPIAA.LWAAuthorizationCredentials;
import com.amazon.SellingPartnerAPIAA.LWAAuthorizationSigner;
import com.amazon.SellingPartnerAPIAA.RateLimitConfiguration;
import com.amazon.SellingPartnerAPIAA.LWAException;

public class CatalogApi {
    private ApiClient apiClient;

    CatalogApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CatalogApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getCatalogItem
     * @param asin The Amazon Standard Identification Number (ASIN) of the item. (required)
     * @param marketplaceIds A comma-delimited list of Amazon marketplace identifiers. Data sets in the response contain data only for the specified marketplaces. (required)
     * @param includedData A comma-delimited list of data sets to include in the response. Default: &#x60;summaries&#x60;. (optional, default to ["summaries"])
     * @param locale Locale for retrieving localized summaries. Defaults to the primary locale of the marketplace. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @throws LWAException If calls to fetch LWA access token fails
     */
    public com.squareup.okhttp.Call getCatalogItemCall(String asin, List<String> marketplaceIds, List<String> includedData, String locale, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, LWAException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/catalog/2022-04-01/items/{asin}"
            .replaceAll("\\{" + "asin" + "\\}", apiClient.escapeString(asin.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (marketplaceIds != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "marketplaceIds", marketplaceIds));
        if (includedData != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "includedData", includedData));
        if (locale != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("locale", locale));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getCatalogItemValidateBeforeCall(String asin, List<String> marketplaceIds, List<String> includedData, String locale, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, LWAException {
        
        // verify the required parameter 'asin' is set
        if (asin == null) {
            throw new ApiException("Missing the required parameter 'asin' when calling getCatalogItem(Async)");
        }
        
        // verify the required parameter 'marketplaceIds' is set
        if (marketplaceIds == null) {
            throw new ApiException("Missing the required parameter 'marketplaceIds' when calling getCatalogItem(Async)");
        }
        

        com.squareup.okhttp.Call call = getCatalogItemCall(asin, marketplaceIds, includedData, locale, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Retrieves details for an item in the Amazon catalog.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 5 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may observe higher rate and burst values than those shown here. For more information, refer to the [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     * @param asin The Amazon Standard Identification Number (ASIN) of the item. (required)
     * @param marketplaceIds A comma-delimited list of Amazon marketplace identifiers. Data sets in the response contain data only for the specified marketplaces. (required)
     * @param includedData A comma-delimited list of data sets to include in the response. Default: &#x60;summaries&#x60;. (optional, default to ["summaries"])
     * @param locale Locale for retrieving localized summaries. Defaults to the primary locale of the marketplace. (optional)
     * @return Item
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws LWAException If calls to fetch LWA access token fails
     */
    public Item getCatalogItem(String asin, List<String> marketplaceIds, List<String> includedData, String locale) throws ApiException,LWAException {
        ApiResponse<Item> resp = getCatalogItemWithHttpInfo(asin, marketplaceIds, includedData, locale);
        return resp.getData();
    }

    /**
     * 
     * Retrieves details for an item in the Amazon catalog.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 5 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may observe higher rate and burst values than those shown here. For more information, refer to the [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     * @param asin The Amazon Standard Identification Number (ASIN) of the item. (required)
     * @param marketplaceIds A comma-delimited list of Amazon marketplace identifiers. Data sets in the response contain data only for the specified marketplaces. (required)
     * @param includedData A comma-delimited list of data sets to include in the response. Default: &#x60;summaries&#x60;. (optional, default to ["summaries"])
     * @param locale Locale for retrieving localized summaries. Defaults to the primary locale of the marketplace. (optional)
     * @return ApiResponse&lt;Item&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws LWAException If calls to fetch LWA access token fails
     */
    public ApiResponse<Item> getCatalogItemWithHttpInfo(String asin, List<String> marketplaceIds, List<String> includedData, String locale) throws ApiException,LWAException {
        com.squareup.okhttp.Call call = getCatalogItemValidateBeforeCall(asin, marketplaceIds, includedData, locale, null, null);
        Type localVarReturnType = new TypeToken<Item>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Retrieves details for an item in the Amazon catalog.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 5 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may observe higher rate and burst values than those shown here. For more information, refer to the [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     * @param asin The Amazon Standard Identification Number (ASIN) of the item. (required)
     * @param marketplaceIds A comma-delimited list of Amazon marketplace identifiers. Data sets in the response contain data only for the specified marketplaces. (required)
     * @param includedData A comma-delimited list of data sets to include in the response. Default: &#x60;summaries&#x60;. (optional, default to ["summaries"])
     * @param locale Locale for retrieving localized summaries. Defaults to the primary locale of the marketplace. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws LWAException If calls to fetch LWA access token fails
     */
    public com.squareup.okhttp.Call getCatalogItemAsync(String asin, List<String> marketplaceIds, List<String> includedData, String locale, final ApiCallback<Item> callback) throws ApiException, LWAException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getCatalogItemValidateBeforeCall(asin, marketplaceIds, includedData, locale, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Item>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchCatalogItems
     * @param marketplaceIds A comma-delimited list of Amazon marketplace identifiers for the request. (required)
     * @param identifiers A comma-delimited list of product identifiers to search the Amazon catalog for. **Note:** Cannot be used with &#x60;keywords&#x60;. (optional)
     * @param identifiersType Type of product identifiers to search the Amazon catalog for. **Note:** Required when &#x60;identifiers&#x60; are provided. (optional)
     * @param includedData A comma-delimited list of data sets to include in the response. Default: &#x60;summaries&#x60;. (optional, default to ["summaries"])
     * @param locale Locale for retrieving localized summaries. Defaults to the primary locale of the marketplace. (optional)
     * @param sellerId A selling partner identifier, such as a seller account or vendor code. **Note:** Required when &#x60;identifiersType&#x60; is &#x60;SKU&#x60;. (optional)
     * @param keywords A comma-delimited list of words to search the Amazon catalog for. **Note:** Cannot be used with &#x60;identifiers&#x60;. (optional)
     * @param brandNames A comma-delimited list of brand names to limit the search for &#x60;keywords&#x60;-based queries. **Note:** Cannot be used with &#x60;identifiers&#x60;. (optional)
     * @param classificationIds A comma-delimited list of classification identifiers to limit the search for &#x60;keywords&#x60;-based queries. **Note:** Cannot be used with &#x60;identifiers&#x60;. (optional)
     * @param pageSize Number of results to be returned per page. (optional, default to 10)
     * @param pageToken A token to fetch a certain page when there are multiple pages worth of results. (optional)
     * @param keywordsLocale The language of the keywords provided for &#x60;keywords&#x60;-based queries. Defaults to the primary locale of the marketplace. **Note:** Cannot be used with &#x60;identifiers&#x60;. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @throws LWAException If calls to fetch LWA access token fails
     */
    public com.squareup.okhttp.Call searchCatalogItemsCall(List<String> marketplaceIds, List<String> identifiers, String identifiersType, List<String> includedData, String locale, String sellerId, List<String> keywords, List<String> brandNames, List<String> classificationIds, Integer pageSize, String pageToken, String keywordsLocale, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, LWAException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/catalog/2022-04-01/items";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (identifiers != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "identifiers", identifiers));
        if (identifiersType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("identifiersType", identifiersType));
        if (marketplaceIds != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "marketplaceIds", marketplaceIds));
        if (includedData != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "includedData", includedData));
        if (locale != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("locale", locale));
        if (sellerId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sellerId", sellerId));
        if (keywords != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "keywords", keywords));
        if (brandNames != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "brandNames", brandNames));
        if (classificationIds != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "classificationIds", classificationIds));
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pageSize", pageSize));
        if (pageToken != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("pageToken", pageToken));
        if (keywordsLocale != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("keywordsLocale", keywordsLocale));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call searchCatalogItemsValidateBeforeCall(List<String> marketplaceIds, List<String> identifiers, String identifiersType, List<String> includedData, String locale, String sellerId, List<String> keywords, List<String> brandNames, List<String> classificationIds, Integer pageSize, String pageToken, String keywordsLocale, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException, LWAException {
        
        // verify the required parameter 'marketplaceIds' is set
        if (marketplaceIds == null) {
            throw new ApiException("Missing the required parameter 'marketplaceIds' when calling searchCatalogItems(Async)");
        }
        

        com.squareup.okhttp.Call call = searchCatalogItemsCall(marketplaceIds, identifiers, identifiersType, includedData, locale, sellerId, keywords, brandNames, classificationIds, pageSize, pageToken, keywordsLocale, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Search for and return a list of Amazon catalog items and associated information either by identifier or by keywords.  **Usage Plans:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 5 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may observe higher rate and burst values than those shown here. For more information, refer to the [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     * @param marketplaceIds A comma-delimited list of Amazon marketplace identifiers for the request. (required)
     * @param identifiers A comma-delimited list of product identifiers to search the Amazon catalog for. **Note:** Cannot be used with &#x60;keywords&#x60;. (optional)
     * @param identifiersType Type of product identifiers to search the Amazon catalog for. **Note:** Required when &#x60;identifiers&#x60; are provided. (optional)
     * @param includedData A comma-delimited list of data sets to include in the response. Default: &#x60;summaries&#x60;. (optional, default to ["summaries"])
     * @param locale Locale for retrieving localized summaries. Defaults to the primary locale of the marketplace. (optional)
     * @param sellerId A selling partner identifier, such as a seller account or vendor code. **Note:** Required when &#x60;identifiersType&#x60; is &#x60;SKU&#x60;. (optional)
     * @param keywords A comma-delimited list of words to search the Amazon catalog for. **Note:** Cannot be used with &#x60;identifiers&#x60;. (optional)
     * @param brandNames A comma-delimited list of brand names to limit the search for &#x60;keywords&#x60;-based queries. **Note:** Cannot be used with &#x60;identifiers&#x60;. (optional)
     * @param classificationIds A comma-delimited list of classification identifiers to limit the search for &#x60;keywords&#x60;-based queries. **Note:** Cannot be used with &#x60;identifiers&#x60;. (optional)
     * @param pageSize Number of results to be returned per page. (optional, default to 10)
     * @param pageToken A token to fetch a certain page when there are multiple pages worth of results. (optional)
     * @param keywordsLocale The language of the keywords provided for &#x60;keywords&#x60;-based queries. Defaults to the primary locale of the marketplace. **Note:** Cannot be used with &#x60;identifiers&#x60;. (optional)
     * @return ItemSearchResults
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws LWAException If calls to fetch LWA access token fails
     */
    public ItemSearchResults searchCatalogItems(List<String> marketplaceIds, List<String> identifiers, String identifiersType, List<String> includedData, String locale, String sellerId, List<String> keywords, List<String> brandNames, List<String> classificationIds, Integer pageSize, String pageToken, String keywordsLocale) throws ApiException,LWAException {
        ApiResponse<ItemSearchResults> resp = searchCatalogItemsWithHttpInfo(marketplaceIds, identifiers, identifiersType, includedData, locale, sellerId, keywords, brandNames, classificationIds, pageSize, pageToken, keywordsLocale);
        return resp.getData();
    }

    /**
     * 
     * Search for and return a list of Amazon catalog items and associated information either by identifier or by keywords.  **Usage Plans:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 5 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may observe higher rate and burst values than those shown here. For more information, refer to the [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     * @param marketplaceIds A comma-delimited list of Amazon marketplace identifiers for the request. (required)
     * @param identifiers A comma-delimited list of product identifiers to search the Amazon catalog for. **Note:** Cannot be used with &#x60;keywords&#x60;. (optional)
     * @param identifiersType Type of product identifiers to search the Amazon catalog for. **Note:** Required when &#x60;identifiers&#x60; are provided. (optional)
     * @param includedData A comma-delimited list of data sets to include in the response. Default: &#x60;summaries&#x60;. (optional, default to ["summaries"])
     * @param locale Locale for retrieving localized summaries. Defaults to the primary locale of the marketplace. (optional)
     * @param sellerId A selling partner identifier, such as a seller account or vendor code. **Note:** Required when &#x60;identifiersType&#x60; is &#x60;SKU&#x60;. (optional)
     * @param keywords A comma-delimited list of words to search the Amazon catalog for. **Note:** Cannot be used with &#x60;identifiers&#x60;. (optional)
     * @param brandNames A comma-delimited list of brand names to limit the search for &#x60;keywords&#x60;-based queries. **Note:** Cannot be used with &#x60;identifiers&#x60;. (optional)
     * @param classificationIds A comma-delimited list of classification identifiers to limit the search for &#x60;keywords&#x60;-based queries. **Note:** Cannot be used with &#x60;identifiers&#x60;. (optional)
     * @param pageSize Number of results to be returned per page. (optional, default to 10)
     * @param pageToken A token to fetch a certain page when there are multiple pages worth of results. (optional)
     * @param keywordsLocale The language of the keywords provided for &#x60;keywords&#x60;-based queries. Defaults to the primary locale of the marketplace. **Note:** Cannot be used with &#x60;identifiers&#x60;. (optional)
     * @return ApiResponse&lt;ItemSearchResults&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @throws LWAException If calls to fetch LWA access token fails
     */
    public ApiResponse<ItemSearchResults> searchCatalogItemsWithHttpInfo(List<String> marketplaceIds, List<String> identifiers, String identifiersType, List<String> includedData, String locale, String sellerId, List<String> keywords, List<String> brandNames, List<String> classificationIds, Integer pageSize, String pageToken, String keywordsLocale) throws ApiException,LWAException {
        com.squareup.okhttp.Call call = searchCatalogItemsValidateBeforeCall(marketplaceIds, identifiers, identifiersType, includedData, locale, sellerId, keywords, brandNames, classificationIds, pageSize, pageToken, keywordsLocale, null, null);
        Type localVarReturnType = new TypeToken<ItemSearchResults>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Search for and return a list of Amazon catalog items and associated information either by identifier or by keywords.  **Usage Plans:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 5 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may observe higher rate and burst values than those shown here. For more information, refer to the [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     * @param marketplaceIds A comma-delimited list of Amazon marketplace identifiers for the request. (required)
     * @param identifiers A comma-delimited list of product identifiers to search the Amazon catalog for. **Note:** Cannot be used with &#x60;keywords&#x60;. (optional)
     * @param identifiersType Type of product identifiers to search the Amazon catalog for. **Note:** Required when &#x60;identifiers&#x60; are provided. (optional)
     * @param includedData A comma-delimited list of data sets to include in the response. Default: &#x60;summaries&#x60;. (optional, default to ["summaries"])
     * @param locale Locale for retrieving localized summaries. Defaults to the primary locale of the marketplace. (optional)
     * @param sellerId A selling partner identifier, such as a seller account or vendor code. **Note:** Required when &#x60;identifiersType&#x60; is &#x60;SKU&#x60;. (optional)
     * @param keywords A comma-delimited list of words to search the Amazon catalog for. **Note:** Cannot be used with &#x60;identifiers&#x60;. (optional)
     * @param brandNames A comma-delimited list of brand names to limit the search for &#x60;keywords&#x60;-based queries. **Note:** Cannot be used with &#x60;identifiers&#x60;. (optional)
     * @param classificationIds A comma-delimited list of classification identifiers to limit the search for &#x60;keywords&#x60;-based queries. **Note:** Cannot be used with &#x60;identifiers&#x60;. (optional)
     * @param pageSize Number of results to be returned per page. (optional, default to 10)
     * @param pageToken A token to fetch a certain page when there are multiple pages worth of results. (optional)
     * @param keywordsLocale The language of the keywords provided for &#x60;keywords&#x60;-based queries. Defaults to the primary locale of the marketplace. **Note:** Cannot be used with &#x60;identifiers&#x60;. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @throws LWAException If calls to fetch LWA access token fails
     */
    public com.squareup.okhttp.Call searchCatalogItemsAsync(List<String> marketplaceIds, List<String> identifiers, String identifiersType, List<String> includedData, String locale, String sellerId, List<String> keywords, List<String> brandNames, List<String> classificationIds, Integer pageSize, String pageToken, String keywordsLocale, final ApiCallback<ItemSearchResults> callback) throws ApiException, LWAException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = searchCatalogItemsValidateBeforeCall(marketplaceIds, identifiers, identifiersType, includedData, locale, sellerId, keywords, brandNames, classificationIds, pageSize, pageToken, keywordsLocale, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ItemSearchResults>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    public static class Builder {
        private LWAAuthorizationCredentials lwaAuthorizationCredentials;
        private String endpoint;
        private LWAAccessTokenCache lwaAccessTokenCache;
        private Boolean disableAccessTokenCache = false;
        private RateLimitConfiguration rateLimitConfiguration;


        public Builder lwaAuthorizationCredentials(LWAAuthorizationCredentials lwaAuthorizationCredentials) {
            this.lwaAuthorizationCredentials = lwaAuthorizationCredentials;
            return this;
        }

        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        
        public Builder lwaAccessTokenCache(LWAAccessTokenCache lwaAccessTokenCache) {
            this.lwaAccessTokenCache = lwaAccessTokenCache;
            return this;
        }
		
	   public Builder disableAccessTokenCache() {
            this.disableAccessTokenCache = true;
            return this;
        }

        public Builder rateLimitConfigurationOnRequests(RateLimitConfiguration rateLimitConfiguration){
            this.rateLimitConfiguration = rateLimitConfiguration;
            return this;
        }
        
        public Builder disableRateLimitOnRequests() {
            this.rateLimitConfiguration = null;
            return this;
        }

        public CatalogApi build() {
            if (lwaAuthorizationCredentials == null) {
                throw new RuntimeException("LWAAuthorizationCredentials not set");
            }

            if (StringUtil.isEmpty(endpoint)) {
                throw new RuntimeException("Endpoint not set");
            }
            
            LWAAuthorizationSigner lwaAuthorizationSigner = null;            
            if (disableAccessTokenCache) {
                lwaAuthorizationSigner = new LWAAuthorizationSigner(lwaAuthorizationCredentials);
            }
            else {
                if (lwaAccessTokenCache == null) {
                    lwaAccessTokenCache = new LWAAccessTokenCacheImpl();                  
                 }
                 lwaAuthorizationSigner = new LWAAuthorizationSigner(lwaAuthorizationCredentials,lwaAccessTokenCache);
            }

            return new CatalogApi(new ApiClient()
                .setLWAAuthorizationSigner(lwaAuthorizationSigner)
                .setBasePath(endpoint)
                .setRateLimiter(rateLimitConfiguration));
        }
    }
}