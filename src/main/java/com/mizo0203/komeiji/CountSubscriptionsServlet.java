package com.mizo0203.komeiji;

import com.mizo0203.komeiji.domain.UseCase;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CountSubscriptionsServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    try (UseCase useCase = new UseCase()) {
      useCase.countSubscriptions();
    }
  }
}
