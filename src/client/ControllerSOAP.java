package client;

import by.makedon.axis.*;
import by.makedon.axis.xsd.Article;
import by.makedon.axis.xsd.impl.ArticleImpl;
import client.model.CurrentPage;
import org.apache.axis2.AxisFault;
import xmlbeans.HandbookServiceStub;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public class ControllerSOAP {
    private static final String URL = "http://localhost:8080/axis2/services/HandbookService";

    private HandbookServiceStub stub;

    ControllerSOAP() {
        try {
            stub = new HandbookServiceStub(URL);
        } catch (AxisFault axisFault) {
            //
        }
    }

    public void updateArticle(int id, String body) {
        UpdateArticleDocument reqDoc = UpdateArticleDocument.Factory.newInstance();
        UpdateArticleDocument.UpdateArticle req = reqDoc.addNewUpdateArticle();

        Article article = req.addNewArgs0();
        article.setArticleId(id);
        article.setBody(body);
        req.setArgs0(article);

        UpdateArticleResponseDocument resp = null;
        try {
            resp = stub.updateArticle(reqDoc);
        } catch (RemoteException e) {
            //
        }

        resp.getUpdateArticleResponse().getReturn();
    }

    public String deleteArticle(int id) {
        DeleteArticleDocument reqDoc = DeleteArticleDocument.Factory.newInstance();
        DeleteArticleDocument.DeleteArticle req = reqDoc.addNewDeleteArticle();

        Article article = req.addNewArgs0();
        article.setArticleId(id);
        req.setArgs0(article);

        DeleteArticleResponseDocument resp = null;
        try {
            resp = stub.deleteArticle(reqDoc);
        } catch (RemoteException e) {
            //
        }

        return resp.getDeleteArticleResponse().getReturn();
    }

    public String add(String title, String body) {
        AddDocument reqDoc = AddDocument.Factory.newInstance();
        AddDocument.Add req = reqDoc.addNewAdd();

        Article article = req.addNewArgs0();
        article.setTitle(title);
        article.setBody(body);
        req.setArgs0(article);

        AddResponseDocument resp = null;
        try {
            resp = stub.add(reqDoc);
        } catch (RemoteException e) {
            //
        }
        return resp.getAddResponse().getReturn();
    }

    public List<String> takeArticleList() {
        TakeArticleListDocument reqDoc = TakeArticleListDocument.Factory.newInstance();
        TakeArticleListDocument.TakeArticleList req = reqDoc.addNewTakeArticleList();

        TakeArticleListResponseDocument resp = null;
        try {
            resp = stub.takeArticleList(reqDoc);
        } catch (RemoteException e) {
            //
        }

        Article[] articles = resp.getTakeArticleListResponse().getReturnArray();
        List<String> titles = new ArrayList<String>();
        for (int index = 0; index < articles.length; index++) {
            titles.add(articles[index].getTitle());
        }

        return titles;
    }
    public void takeArticle(String title) {
        TakeArticleDocument reqDoc = TakeArticleDocument.Factory.newInstance();
        TakeArticleDocument.TakeArticle req = reqDoc.addNewTakeArticle();

        req.setArgs0(title);
        TakeArticleResponseDocument resp = null;
        try {
            resp = stub.takeArticle(reqDoc);
        } catch (RemoteException e) {
            //
        }

        Article article = resp.getTakeArticleResponse().getReturn();
        CurrentPage currentPage = CurrentPage.getInstance();

        currentPage.setArticleId(article.getArticleId());
        currentPage.setTitle(article.getTitle());
        currentPage.setBody(article.getBody());
        currentPage.setDate(article.getDate().getTime());
        currentPage.setImageId(article.getImage().getImageId());
        currentPage.setPath(article.getImage().getPath());
        currentPage.setAuthorId(article.getAuthor().getAuthorId());
        currentPage.setName(article.getAuthor().getName());
        currentPage.setSurname(article.getAuthor().getSurname());
        currentPage.setCountry(article.getAuthor().getCountry());
    }
}
