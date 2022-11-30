package com.nashss.se.partyplaylist.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.nashss.se.partyplaylist.activity.requests.GetHostRequest;
import com.nashss.se.partyplaylist.activity.results.GetHostResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GetHostLambda extends LambdaActivityRunner<GetHostRequest, GetHostResult>
        implements RequestHandler<LambdaRequest<GetHostRequest>, LambdaResponse> {

    private final Logger log = LogManager.getLogger();

    @Override
    public LambdaResponse handleRequest(LambdaRequest<GetHostRequest> input, Context context) {
        log.info("handleRequest");
        return super.runActivity(
                () -> input.fromPath(path ->
                        GetHostRequest.builder()
                                .withPlaylistName(path.get("playlistName"))
                                .withFirstName(path.get("firstName"))
                                .withLastName(path.get("lastName"))
                                .build()),
                (request, serviceComponent) ->
                        serviceComponent.provideGetHostActivity().handleRequest(request)
        );
    }
}
