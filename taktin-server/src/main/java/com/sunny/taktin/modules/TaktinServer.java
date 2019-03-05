package com.sunny.taktin.modules;

import com.sunny.commom.utils.module.AbstractModule;
import com.sunny.commom.web.jersey.JerseyServer;
import com.sunny.infra.conf.parser.ConfInit;
import com.sunny.rw.server.conf.ServerConf;
import com.sunny.rw.server.modules.AbstractRwServer;
import org.eclipse.jetty.server.Server;

/*
 * Created by sunnnychan@gmail.com on 2019/3/5.
 */
public class TaktinServer extends AbstractRwServer {

  public static void main(String[] args) throws Exception {
    parserConf(args);
    TaktinServer rwServer = new TaktinServer();
    rwServer.startServer();
    rwServer.startModules();
  }

  private static void parserConf(String[] args) {
    if (args.length != 1) {
      System.out.println("Usage: <config file path>");
      System.exit(1);
    }
    ConfInit.init(args[0]);
  }

}
