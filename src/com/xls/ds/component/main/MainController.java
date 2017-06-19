package com.xls.ds.component.main;

import com.alibaba.fastjson.JSONObject;
import com.jfoenix.controls.*;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import com.xls.ds.component.main.model.ExtractApplyData;
import com.xls.ds.remote.ExtractApply;
import com.xls.ds.remote.ExtractApplyPage;
import com.xls.ds.utils.HttpClientUtils;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.layout.StackPane;
import javafx.util.Callback;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.function.Function;

/**
 * Created by luoshun
 */
public class MainController implements Initializable {
    @FXML
    private StackPane applyPane;
    @FXML
    private JFXTreeTableView<ExtractApplyData> applyTable;
    @FXML
    private JFXDialog remoteDialog;
    @FXML
    private JFXButton remoteDialogButton;

    public void initialize(URL location, ResourceBundle resources) {
        JFXTreeTableColumn<ExtractApplyData, String> applyType = new JFXTreeTableColumn<>("提现类型");
        applyType.setPrefWidth(150);
        initColumn(applyType, ExtractApplyData::extractTypeProperty);

        JFXTreeTableColumn<ExtractApplyData, String> cardName = new JFXTreeTableColumn<>("持卡人");
        cardName.setPrefWidth(150);
        initColumn(cardName, ExtractApplyData::cardNameProperty);

        JFXTreeTableColumn<ExtractApplyData, String> bankName = new JFXTreeTableColumn<>("银行名称");
        bankName.setPrefWidth(150);
        initColumn(bankName, ExtractApplyData::bankNameProperty);

        JFXTreeTableColumn<ExtractApplyData, String> cardNo = new JFXTreeTableColumn<>("银行卡号");
        cardNo.setPrefWidth(150);
        initColumn(cardNo, ExtractApplyData::cardNoProperty);

        JFXTreeTableColumn<ExtractApplyData, Double> cashBackTotalAmount = new JFXTreeTableColumn<>("金额");
        cashBackTotalAmount.setPrefWidth(150);
        initColumn(cashBackTotalAmount, apply -> apply.cashBackTotalAmountProperty().asObject());

        JFXTreeTableColumn<ExtractApplyData, String> city = new JFXTreeTableColumn<>("市");
        city.setPrefWidth(150);
        initColumn(city, ExtractApplyData::cityProperty);

        JFXTreeTableColumn<ExtractApplyData, String> county = new JFXTreeTableColumn<>("区");
        county.setPrefWidth(150);
        initColumn(county, ExtractApplyData::countyProperty);

        JFXTreeTableColumn<ExtractApplyData, String> provinceType = new JFXTreeTableColumn<>("省");
        provinceType.setPrefWidth(150);
        initColumn(provinceType, ExtractApplyData::provinceTypeProperty);

        JFXTreeTableColumn<ExtractApplyData, String> district = new JFXTreeTableColumn<>("区域");
        district.setPrefWidth(150);
        initColumn(district, ExtractApplyData::districtProperty);

        JFXTreeTableColumn<ExtractApplyData, Double> goodsTotalAmount = new JFXTreeTableColumn<>("货款");
        goodsTotalAmount.setPrefWidth(150);
        initColumn(goodsTotalAmount, apply -> apply.goodsTotalAmountProperty().asObject());

        JFXTreeTableColumn<ExtractApplyData, Double> money = new JFXTreeTableColumn<>("余额");
        money.setPrefWidth(150);
        initColumn(money, apply -> apply.moneyProperty().asObject());

        JFXTreeTableColumn<ExtractApplyData, String> note = new JFXTreeTableColumn<>("备注");
        note.setPrefWidth(150);
        initColumn(note, ExtractApplyData::noteProperty);

        JFXTreeTableColumn<ExtractApplyData, String> phone = new JFXTreeTableColumn<>("电话");
        phone.setPrefWidth(150);
        initColumn(phone, ExtractApplyData::phoneProperty);

        JFXTreeTableColumn<ExtractApplyData, Double> reimburseTotalAmount = new JFXTreeTableColumn<>("退款金额");
        reimburseTotalAmount.setPrefWidth(150);
        initColumn(reimburseTotalAmount, apply -> apply.reimburseTotalAmountProperty().asObject());

        JFXTreeTableColumn<ExtractApplyData, String> saleOrdersId = new JFXTreeTableColumn<>("单号");
        saleOrdersId.setPrefWidth(150);
        initColumn(saleOrdersId, ExtractApplyData::saleOrdersIdProperty);

        JFXTreeTableColumn<ExtractApplyData, String> status = new JFXTreeTableColumn<>("状态");
        status.setPrefWidth(150);
        initColumn(status, ExtractApplyData::statusProperty);

        JFXTreeTableColumn<ExtractApplyData, String> stime = new JFXTreeTableColumn<>("时间");
        stime.setPrefWidth(150);
        initColumn(stime, ExtractApplyData::stimeProperty);

        JFXTreeTableColumn<ExtractApplyData, String> userMsg = new JFXTreeTableColumn<>("用户");
        userMsg.setPrefWidth(150);
        initColumn(userMsg, ExtractApplyData::userMsgProperty);

        this.queryRemoteData();
        ObservableList<ExtractApplyData> applyList = this.queryRemoteData();

        final TreeItem<ExtractApplyData> root = new RecursiveTreeItem<>(applyList, RecursiveTreeObject::getChildren);
        applyTable.getColumns().setAll(applyType, cardName, bankName, cardNo, cashBackTotalAmount, city,
                county, provinceType, district, goodsTotalAmount, money, note, phone, reimburseTotalAmount,
                saleOrdersId, status, stime, userMsg);
        applyTable.setRoot(root);
        applyTable.setShowRoot(false);
    }

    private ObservableList<ExtractApplyData> queryRemoteData() {
        String string = null;
        try {
            string = HttpClientUtils.sendHttpRequest("http://admin.zhgfxly.com/extract/getExportData.do?page=1&rows=10", null, "utf-8", false);
            ExtractApplyPage page = JSONObject.parseObject(string, ExtractApplyPage.class);

            ObservableList<ExtractApplyData> data = FXCollections.observableArrayList();
            List<ExtractApply> remoteDataList = page.getRows();
            for (ExtractApply apply: remoteDataList) {
                data.add(new ExtractApplyData(apply.getCardName(), apply.getExtractType()));
            }

            return data;
        } catch (IOException e) {
            remoteDialog.show(applyPane);
        }
        ExtractApplyPage page = JSONObject.parseObject(string, ExtractApplyPage.class);
        return null;
    }

    private <T> void initColumn(JFXTreeTableColumn<ExtractApplyData, T> column, Function<ExtractApplyData, ObservableValue<T>> mapper) {
        column.setCellValueFactory((TreeTableColumn.CellDataFeatures<ExtractApplyData, T> param) -> {
            if (column.validateValue(param)) {
                return mapper.apply(param.getValue().getValue());
            } else {
                return column.getComputedValue(param);
            }
        });
    }
}
