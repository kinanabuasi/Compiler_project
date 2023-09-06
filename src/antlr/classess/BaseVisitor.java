package antlr.classess;

import antlr.AST.Node;
import antlr.parserproject;
import antlr.parserprojectBaseVisitor;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;
import java.lang.Double;

public class BaseVisitor extends parserprojectBaseVisitor{

    synbol_table st=new synbol_table();
    @Override
    public prog visitProg(parserproject.ProgContext ctx) {
        prog Program =new prog();
        if(ctx!=null)
        {
            for(int i=0;i<ctx.libraryDefinition().size();i++){
                Program.get_imports_list().add(visitLibraryDefinition(ctx.libraryDefinition(i)));
            }
            for(int i=0;i<ctx.classDefinition().size();i++){
                Program.get_class_list().add(visitClassDefinition(ctx.classDefinition(i)));
            }
            if(!ctx.libraryDefinition().isEmpty()&&!ctx.classDefinition().isEmpty())
            {
                /*Node node=new Node();
                node.setName("Program");
                node.set*/
            }
        }
        this.st.print();
        return Program;
    }

    @Override
    public Library_Def visitLibraryDefinition(parserproject.LibraryDefinitionContext ctx) {
        Library_Def library_def=new Library_Def();
        if(ctx!=null)
        {
            if(ctx.uri()!=null){
                library_def.setUri(visitUri(ctx.uri()));
            }
            if(ctx.className()!=null){
                library_def.setClassName(visitClassName(ctx.className()));
            }
        }

        return library_def;
    }

    @Override
    public Class_Def visitClassDefinition(parserproject.ClassDefinitionContext ctx) {
        Class_Def class_def=new Class_Def();
        if(ctx!=null)
        {
            if(ctx.normalclassDefinition()!=null){
                class_def.setNormalclassDefinition(visitNormalclassDefinition(ctx.normalclassDefinition()));
            }
            if(ctx.futerrclassDefinition()!=null){
                class_def.setFuterrclassDefinition(visitFuterrclassDefinition(ctx.futerrclassDefinition()));
            }
        }

        return class_def;
    }

    @Override
    public Normal_Class visitNormalclassDefinition(parserproject.NormalclassDefinitionContext ctx) {

        Normal_Class normal_class=new Normal_Class();
        // List<Line> lines=new ArrayList<Line>();
        if(ctx!=null)
        {
            if(ctx.ABSTRACT()!=null&&ctx.EXTENDES()!=null){
                normal_class.setABSTRACT(ctx.ABSTRACT().toString());
                normal_class.setID(ctx.ID().toString());
                normal_class.setEXTENDES(ctx.EXTENDES().toString());
                normal_class.setID(ctx.ID(1).toString());
                for(int i=0;i<ctx.line().size();i++){
                    normal_class.getLine().add(visitLine(ctx.line(i)));
                }

            }
            if(ctx.ABSTRACT()!=null&&ctx.EXTENDES()==null){
                normal_class.setABSTRACT(ctx.ABSTRACT().toString());
                normal_class.setID(ctx.ID().toString());
                for(int i=0;i<ctx.line().size();i++){
                    normal_class.getLine().add(visitLine(ctx.line(i)));
                }
            }
            if(ctx.ABSTRACT()==null&&ctx.EXTENDES()!=null){
                normal_class.setID(ctx.ID().toString());
                normal_class.setEXTENDES(ctx.EXTENDES().toString());
                normal_class.setID(ctx.ID(1).toString());
                for(int i=0;i<ctx.line().size();i++){
                    normal_class.getLine().add(visitLine(ctx.line(i)));
                }
            }

            if(ctx.ABSTRACT()==null&&ctx.EXTENDES()==null){
                normal_class.setID(ctx.ID().toString());
                for(int i=0;i<ctx.line().size();i++){
                    normal_class.getLine().add(visitLine(ctx.line(i)));
                }
            }
            if(ctx.ID()!=null)
            {
                Token idtoken=(Token) ctx.CLASS().getSymbol();
                int line=idtoken.getLine();
                row_table rowTable=new row_table();
                rowTable.setType("Class");
                rowTable.setName(normal_class.getID());
                rowTable.setValue("-");
                rowTable.setLine(line);
                this.st.getRows().add(rowTable);
            }
        }


        return  normal_class;
    }

    @Override
    public Flutter_Class visitFuterrclassDefinition(parserproject.FuterrclassDefinitionContext ctx) {
        Flutter_Class flutter_class=new Flutter_Class();
        if(ctx!=null)
        {
            if(ctx.statelessWidget()!=null){
                flutter_class.setStatelessWidget(visitStatelessWidget(ctx.statelessWidget()));
                Token idtoken=(Token) ctx.statelessWidget().CLASS().getSymbol();
                int line=idtoken.getLine();
                row_table rowTable=new row_table();
                rowTable.setType("Flutter Class (StateLeesWidget)");
                rowTable.setName(flutter_class.statelessWidget.getID());
                rowTable.setValue("-");
                rowTable.setLine(line);
                this.st.getRows().add(rowTable);
            } if(ctx.statefulWidget()!=null){
            flutter_class.setStatefulWidget(visitStatefulWidget(ctx.statefulWidget()));
            Token idtoken=(Token) ctx.statefulWidget().CLASS(0).getSymbol();
            int line=idtoken.getLine();
            row_table rowTable=new row_table();
            rowTable.setType("Flutter Class (statefulWidget)");
            rowTable.setName(flutter_class.statefulWidget.getID());
            rowTable.setValue("-");
            rowTable.setLine(line);
            this.st.getRows().add(rowTable);
        }
        }

        return flutter_class;
    }

    @Override
    public StateFullClass visitStatefulWidget(parserproject.StatefulWidgetContext ctx) {
        StateFullClass stateFullClass=new StateFullClass();
        if(ctx!=null)
        {
            if(ctx.ABSTRACT()!=null){
                stateFullClass.setABSTRACT(ctx.ABSTRACT().toString());
                stateFullClass.setID(ctx.ID(0).toString());
                stateFullClass.setEXTENDES(ctx.EXTENDES().toString());
                stateFullClass.setStatefulWidget(ctx.StatefulWidget().toString());
                stateFullClass.setBuildScreen(visitBuildScreen(ctx.buildScreen()));
            }
            if(ctx.ABSTRACT()==null){
                stateFullClass.setID(ctx.ID(0).toString());
                stateFullClass.setEXTENDES(ctx.EXTENDES().toString());
                stateFullClass.setStatefulWidget(ctx.StatefulWidget().toString());
                stateFullClass.setBuildScreen(visitBuildScreen(ctx.buildScreen()));
            }
        }

        return stateFullClass;
    }

    @Override
    public StateLessClass visitStatelessWidget(parserproject.StatelessWidgetContext ctx) {
        StateLessClass stateLessClass=new StateLessClass();
        if(ctx!=null)
        {
            if(ctx.ABSTRACT()!=null){
                stateLessClass.setABSTRACT(ctx.ABSTRACT().toString());
                stateLessClass.setID(ctx.ID(0).toString());
                stateLessClass.setEXTENDES(ctx.EXTENDES().toString());
                stateLessClass.setStatelessWidget(ctx.StatelessWidget().toString());
                stateLessClass.setBuildScreen(visitBuildScreen(ctx.buildScreen()));
            }
            if(ctx.ABSTRACT()==null){
                stateLessClass.setID(ctx.ID(0).toString());
                stateLessClass.setEXTENDES(ctx.EXTENDES().toString());
                stateLessClass.setStatelessWidget(ctx.StatelessWidget().toString());
                stateLessClass.setBuildScreen(visitBuildScreen(ctx.buildScreen()));
            }
        }

        return stateLessClass;
    }

    @Override
    public BuildScreen visitBuildScreen(parserproject.BuildScreenContext ctx) {

        BuildScreen buildScreen=new BuildScreen();
        if(ctx!=null)
        {
            buildScreen.setFlutterline(visitFlutterline(ctx.flutterline()));
        }

        return buildScreen;
    }

    @Override
    public Flutter_lines visitFlutterline(parserproject.FlutterlineContext ctx)
    {
        Flutter_lines flutter_lines=new Flutter_lines();
        if(ctx!=null)
        {
            flutter_lines.setAppBar(visitAppBar(ctx.appBar()));
            flutter_lines.setBody(visitBody(ctx.body()));
        }

        return flutter_lines;
    }

    @Override
    public AppBar visitAppBar(parserproject.AppBarContext ctx) {
        AppBar appBar =new AppBar();
        if(ctx!=null)
        {
            appBar.setTitle(visitTitle(ctx.title()));
            Token idtoken=(Token) ctx.AppBar().getSymbol();
            int line=idtoken.getLine();
            row_table rowTable=new row_table();
            rowTable.setType("App Bar");
            rowTable.setName("add App Bar");
            rowTable.setValue(appBar.getTitle().getSTRING());
            rowTable.setLine(line);
            this.st.getRows().add(rowTable);
        }

        return appBar;
    }

    @Override
    public Titel visitTitle(parserproject.TitleContext ctx)
    {
        Titel titel=new Titel();
        if(ctx!=null)
        {
            if(ctx.STRING()!=null)
            {
                titel.setSTRING(ctx.STRING().getText());

            }
            if(ctx.StringTitelWithDolar()!=null)
            {
                titel.setSTRING(ctx.StringTitelWithDolar().getText());

            }

        }


        return titel;
    }

    @Override
    public Body visitBody(parserproject.BodyContext ctx) {
        Body body=new Body();
        if(ctx!=null)
        {
            if(ctx.rows()!=null){
                body.setRows(visitRows(ctx.rows()));
                Token idtoken=(Token) ctx.BODY().getSymbol();
                int line=idtoken.getLine();
                row_table rowTable=new row_table();
                rowTable.setType("Body");
                rowTable.setName("-");
                rowTable.setValue("add Body");
                rowTable.setLine(line);
                this.st.getRows().add(rowTable);
            }
            if(ctx.columns()!=null){
                body.setColumns(visitColumns(ctx.columns()));
                Token idtoken=(Token) ctx.BODY().getSymbol();
                int line=idtoken.getLine();
                row_table rowTable=new row_table();
                rowTable.setType("Body");
                rowTable.setName("-");
                rowTable.setValue("add Body");
                rowTable.setLine(line);
                this.st.getRows().add(rowTable);
            }
            if(ctx.container()!=null){
                body.setContainer(visitContainer(ctx.container()));
                Token idtoken=(Token) ctx.BODY().getSymbol();
                int line=idtoken.getLine();
                row_table rowTable=new row_table();
                rowTable.setType("Body");
                rowTable.setName("-");
                rowTable.setValue("add Body");
                rowTable.setLine(line);
                this.st.getRows().add(rowTable);
            }
        }

        return body;
    }

    @Override
    public Column visitColumns(parserproject.ColumnsContext ctx) {
        Column column=new Column();
        if(ctx!=null)
        {
            column.setChildren(visitChildren(ctx.children()));
        }

        return column;
    }

    @Override
    public Row visitRows(parserproject.RowsContext ctx)
    {
        Row row=new Row();
        if(ctx!=null)
        {
            row.setChildren(visitChildren(ctx.children()));
        }

        return row;
    }

    @Override
    public Children visitChildren(parserproject.ChildrenContext ctx) {

        Children children=new Children();
        if(ctx!=null)
        {
            for(int i=0;i<ctx.widgets().size();i++){
                children.getWidgetsList().add(visitWidgets(ctx.widgets(i)));
            }
        }

        return children;
    }

    @Override
    public List_View visitList_view(parserproject.List_viewContext ctx)

    {
        List_View list_view=new List_View();
        if(ctx!=null)
        {
            list_view.setItemBuilder(visitItemBuilder(ctx.itemBuilder()));
            list_view.setItemCount(visitItemCount(ctx.itemCount()));
        }

        return list_view;
    }

    @Override
    public ItemCount visitItemCount(parserproject.ItemCountContext ctx)
    {
        ItemCount itemCount=new ItemCount();
        if(ctx!=null)
        {
            if(ctx.ID()!=null&&ctx.Length()!=null){
                itemCount.setID(ctx.ID().toString());
                itemCount.setLength(ctx.Length().toString());

                Token idtoken1=(Token) ctx.ID().getSymbol();
                Token idtoken2=(Token) ctx.Length().getSymbol();

                int line=idtoken1.getLine();
                row_table rowTable=new row_table();
                rowTable.setType("List Item Count");
                rowTable.setName(itemCount.getID());
                rowTable.setValue(itemCount.getLength());
                rowTable.setLine(line);
                this.st.getRows().add(rowTable);
            }
            if(ctx.NUMBER()!=null){
                itemCount.setNum(Integer.parseInt(ctx.NUMBER().toString()));

                Token idtoken=(Token) ctx.NUMBER().getSymbol();
                int line=idtoken.getLine();
                row_table rowTable=new row_table();
                rowTable.setType("List Item Count");
                rowTable.setValue(String.valueOf(itemCount.getNum()));
                rowTable.setLine(line);
                this.st.getRows().add(rowTable);
            }}

        return itemCount;
    }

    @Override
    public ItemBuilder visitItemBuilder(parserproject.ItemBuilderContext ctx)

    {
        ItemBuilder itemBuilder=new ItemBuilder();
        if(ctx!=null)
        {
            itemBuilder.setGestureDetector(visitGestureDetector(ctx.gestureDetector()));
        }

        return itemBuilder;
    }

    @Override
    public GestureDetector visitGestureDetector(parserproject.GestureDetectorContext ctx) {
        GestureDetector gestureDetector =new GestureDetector();
        if(ctx!=null)
        {
            gestureDetector.setOntap(visitOnTap(ctx.onTap()));
            gestureDetector.setChild(visitChild(ctx.child()));
        }

        return gestureDetector;
    }

    @Override
    public Widgets visitWidgets(parserproject.WidgetsContext ctx) {

        Widgets widgets=new Widgets();
        if(ctx!=null)
        {
            if(ctx.rows()!=null){
                widgets.setRows(visitRows(ctx.rows()));
            }
            if(ctx.columns()!=null){
                widgets.setColumns(visitColumns(ctx.columns()));
            }
            if(ctx.list_view()!=null){
                widgets.setList_view(visitList_view(ctx.list_view()));
            }
            if(ctx.container()!=null){
                widgets.setContainer(visitContainer(ctx.container()));
            }
            if(ctx.title()!=null){
                widgets.setTitle(visitTitle(ctx.title()));
            }
            if(ctx.color()!=null){
                widgets.setColor(visitColor(ctx.color()));
            }
            if(ctx.padding_bigP()!=null){
                widgets.setpadding_bigP(visitPadding_bigP(ctx.padding_bigP()));
            }
            if(ctx.text_Failed()!=null){
                widgets.setText_Failed(visitText_Failed(ctx.text_Failed()));
            }
            if(ctx.elevatedButton()!=null){
                widgets.setElevatedButton(visitElevatedButton(ctx.elevatedButton()));
            }
            if(ctx.image()!=null){
                widgets.setImage(visitImage(ctx.image()));
            }
            if(ctx.sizedBox()!=null){
                widgets.setSizedBox(visitSizedBox(ctx.sizedBox()));
            }
            if(ctx.expanded()!=null){
                widgets.setExpanded(visitExpanded(ctx.expanded()));
            }
            widgets.setCenter(visitCenter(ctx.center()));
        }


        return widgets;

    }


    //---------------------------------------Lujain--------------------------------------------------
    @Override
    public Container visitContainer(parserproject.ContainerContext ctx)
    {
        Container container=new Container();
        if(ctx!=null)
        {
            for (int i=0;i<ctx.containerBody().size();i++){
                container.getContainer_body().add(visitContainerBody(ctx.containerBody(i)));
            }
            container.setChild(visitChild(ctx.child()));
        }

        return container;
    }


    @Override
    public Container_Body visitContainerBody(parserproject.ContainerBodyContext ctx) {
        Container_Body container_body=new Container_Body();
        if(ctx!=null)
        {
            if(ctx.width()!=null){
                container_body.setWidth(visitWidth(ctx.width()));
            }
            if(ctx.hieght()!=null){
                container_body.setHieght(visitHieght(ctx.hieght()));
            }
            if(ctx.padding()!=null){
                container_body.setPadding(visitPadding(ctx.padding()));
            }
            if(ctx.container_decoration()!=null){
                container_body.setContainerDecoration(visitContainer_decoration(ctx.container_decoration()));
            }
        }

        return container_body;
    }

    @Override
    public Expanded visitExpanded(parserproject.ExpandedContext ctx) {

        Expanded expanded=new Expanded();
        if(ctx!=null)
        {
            expanded.setChild(visitChild(ctx.child()));
        }

        return expanded;
    }

    @Override
    public WIDTH visitWidth(parserproject.WidthContext ctx) {

        WIDTH width=new WIDTH();
        width.setNUMBER(Integer.parseInt(ctx.NUMBER().toString()));



        return width;
    }

    @Override
    public HIEGHT visitHieght(parserproject.HieghtContext ctx) {

        HIEGHT hieght=new HIEGHT();
        hieght.setNUMBER(Integer.parseInt(ctx.NUMBER().toString()));




        return hieght;
    }

    @Override
    public Child visitChild(parserproject.ChildContext ctx) {

        Child child=new Child();
        if(ctx!=null)
        {
            child.setWidget(visitWidgets(ctx.widgets()));
        }


        return child;
    }

    @Override
    public Size_Box visitSizedBox(parserproject.SizedBoxContext ctx)
    {
        Size_Box size_box=new Size_Box();
        if(ctx!=null)
        {
            if(ctx.hieght()!=null){
                size_box.setHieght(visitHieght(ctx.hieght()));
            }
            if(ctx.width()!=null){
                size_box.setWidth(visitWidth(ctx.width()));
            }
            if(ctx.width()!=null&&ctx.hieght()!=null){
                size_box.setWidth(visitWidth(ctx.width()));
                size_box.setHieght(visitHieght(ctx.hieght()));
            }
        }

        return size_box;
    }

    @Override
    public OnTap visitOnTap(parserproject.OnTapContext ctx) {

        OnTap onTap=new OnTap();
        if(ctx!=null)
        {
            onTap.setSetState(visitSetState(ctx.setState()));
        }

        return onTap;
    }

    @Override
    public SetState visitSetState(parserproject.SetStateContext ctx)
    {
        SetState setState=new SetState();
        if(ctx!=null)
        {
            setState.setWidgets(visitWidgets(ctx.widgets()));
        }

        return setState;
    }

    @Override
    public Color visitColor(parserproject.ColorContext ctx) {

        Color color=new Color();
        color.setColor(ctx.ID().toString());

        return color;
    }

    @Override
    public Padding visitPadding(parserproject.PaddingContext ctx)
    {
        Padding padding=new Padding();
        padding.setValue1(visitValue1(ctx.value1()));
        return padding;
    }

    @Override
    public Padding visitPadding_bigP(parserproject.Padding_bigPContext ctx) {

        Padding padding1=new Padding();
        if(ctx!=null)
        {
            padding1.setValue1(visitValue1(ctx.value1()));
            padding1.setChild(visitChild(ctx.child()));
        }

        return padding1;
    }

    @Override
    public Center visitCenter(parserproject.CenterContext ctx) {

        Center center=new Center();
        if(ctx!=null)
        {
            center.setChild(visitChild(ctx.child()));
        }

        return center;
    }

    @Override
    public Text_Failes visitText_Failed(parserproject.Text_FailedContext ctx) {

        Text_Failes text_failes=new Text_Failes();
        if(ctx.obscureText()!=null){
            text_failes.setObscureText(visitObscureText(ctx.obscureText()));
        }
        else
            text_failes.setDecoration(visitDecoration(ctx.decoration()));

        return text_failes;
    }

    @Override
    public Elevated_B visitElevatedButton(parserproject.ElevatedButtonContext ctx) {
        Elevated_B elevated_b=new Elevated_B();
        elevated_b.setTitel(visitTitle(ctx.title()));
        return elevated_b;
    }

    @Override
    public ObscureText visitObscureText(parserproject.ObscureTextContext ctx) {

        ObscureText obscureText=new ObscureText();
        if(ctx.TRUE()!=null)
        {
            Value_4 value4=new Value_4();
            value4.setTRUE(ctx.TRUE().toString());
            obscureText.setValue4(value4);
            return obscureText;
        }
        Value_4 value4=new Value_4();
        value4.setFALSE(ctx.FALSE().toString());
        obscureText.setValue4(value4);
        return obscureText;
    }

    @Override
    public Decoration visitDecoration(parserproject.DecorationContext ctx) {
        Decoration decoration=new Decoration();
        decoration.setBorder(visitBorder(ctx.border()));
        decoration.setHinttext(visitHinttext(ctx.hinttext()));
        decoration.setLabeltext(visitLabeltext(ctx.labeltext()));
        return decoration;
    }

    @Override
    public ContainerDecoration visitContainer_decoration(parserproject.Container_decorationContext ctx) {
        ContainerDecoration containerDecoration=new ContainerDecoration();
        containerDecoration.setColor(visitColor(ctx.color()));
        containerDecoration.setBorderRadius(visitBorderRadius(ctx.borderRadius()));
        return containerDecoration;
    }

    @Override
    public Border visitBorderRadius(parserproject.BorderRadiusContext ctx)
    {
        Border border=new Border();
        border.setValue1(visitValue1(ctx.value1()));
        return border;
    }

    @Override
    public Border1 visitBorder(parserproject.BorderContext ctx) {

        Border1 border1=new Border1();
        border1.setOutlineInputBorder(ctx.OutlineInputBorder().toString());
        return border1;
    }

    @Override
    public Label visitLabeltext(parserproject.LabeltextContext ctx) {

        Label label=new Label();
        label.setID(ctx.STRING().toString());
        return label;
    }

    @Override
    public HintText visitHinttext(parserproject.HinttextContext ctx) {

        HintText hintText=new HintText();
        hintText.setID(ctx.STRING().toString());
        return hintText;
    }

    @Override
    public Image visitImage(parserproject.ImageContext ctx)
    {
        Image image=new Image();
        if(ctx!=null)
        {
            if(ctx.stringImage()!=null)
            {
                if(ctx.stringImage().ID()!=null)
                {
                    image.setID(ctx.stringImage().ID().toString());

                    Token idtoken=(Token) ctx.stringImage().ID().getSymbol();
                    int line=idtoken.getLine();
                    row_table rowTable=new row_table();
                    rowTable.setType("image");
                    rowTable.setName("-");
                    rowTable.setValue(image.getID());
                    rowTable.setLine(line);
                    this.st.getRows().add(rowTable);
                }
                if(ctx.stringImage().StringTitelWithDolar()!=null)
                {
                    image.setID(ctx.stringImage().StringTitelWithDolar().toString());

                    Token idtoken=(Token) ctx.stringImage().StringTitelWithDolar().getSymbol();
                    int line=idtoken.getLine();
                    row_table rowTable=new row_table();
                    rowTable.setType("image");
                    rowTable.setName("-");
                    rowTable.setValue(image.getID());
                    rowTable.setLine(line);
                    this.st.getRows().add(rowTable);
                }
            }

        }


        return image;
    }



    @Override
    public URI_Class visitUri(parserproject.UriContext ctx)
    {
        URI_Class uri=new URI_Class();
        for(int i=0;i<ctx.folderName().size();i++){
            uri.getFolderName().add(visitFolderName(ctx.folderName(i)));
        }
        return uri;
    }

    @Override
    public Class_Name visitClassName(parserproject.ClassNameContext ctx) {
        Class_Name className=new Class_Name();
        className.setID(ctx.ID().toString());
        className.setDOTEDART(ctx.DOTEDART().toString());

        return className;
    }

    @Override
    public Folder_Names visitFolderName(parserproject.FolderNameContext ctx) {

        Folder_Names folder_names=new Folder_Names();
        folder_names.setID(ctx.ID().toString());
        return folder_names;
    }

    @Override
    public Var_Def visitVariabelDefinition(parserproject.VariabelDefinitionContext ctx) {
        Var_Def var_def=new Var_Def();
        var_def.setLeteOrFinal(visitLeteOrFinal(ctx.leteOrFinal()));
        return var_def;
    }

    @Override
    public Fun_Def visitFunctionDefinition(parserproject.FunctionDefinitionContext ctx) {
        Fun_Def fun_def=new Fun_Def();
        if(ctx.voidFunction()!=null)
        {
            fun_def.setVoidFunction(visitVoidFunction(ctx.voidFunction()));
        }
        if(ctx.typeFunction()!=null)
        {
            fun_def.setTypeFunction(visitTypeFunction(ctx.typeFunction()));
        }
        return fun_def;

    }

    @Override
    public Void_Function visitVoidFunction(parserproject.VoidFunctionContext ctx)
    {
        Void_Function voidFunction=new Void_Function();
        if(ctx.VOID()!=null)
        {
            if(ctx.ID()!=null)
            {
                if(!ctx.parameters().isEmpty())
                {
                    if(!ctx.line().isEmpty())
                    {
                        List<Parameters> parameters=new ArrayList<>();
                        List<Line> lines=new ArrayList<>();
                        for (int i=0;i<ctx.parameters().size();i++)
                        {
                            parameters.add(visitParameters(ctx.parameters().get(i)));
                        }
                        for (int i=0;i<ctx.line().size();i++)
                        {
                            lines.add(visitLine(ctx.line().get(i)));
                        }
                        voidFunction.setVOID(ctx.VOID().toString());
                        voidFunction.setID(ctx.ID().toString());
                        voidFunction.setParameters(parameters);
                        voidFunction.setStetements(lines);
                        Token idtoken=(Token) ctx.VOID().getSymbol();
                        int line=idtoken.getLine();
                        row_table rowTable=new row_table();
                        rowTable.setType("Function");
                        rowTable.setName(voidFunction.getID());
                        rowTable.setValue("-");
                        rowTable.setLine(line);
                        this.st.getRows().add(rowTable);
                    }
                    else
                    {
                        List<Parameters> parameters=new ArrayList<>();
                        for (int i=0;i<ctx.parameters().size();i++)
                        {
                            parameters.add(visitParameters(ctx.parameters().get(i)));
                        }

                        voidFunction.setVOID(ctx.VOID().toString());
                        voidFunction.setID(ctx.ID().toString());
                        voidFunction.setParameters(parameters);
                        Token idtoken=(Token) ctx.VOID().getSymbol();
                        int line=idtoken.getLine();
                        row_table rowTable=new row_table();
                        rowTable.setType("Function");
                        rowTable.setName(voidFunction.getID());
                        rowTable.setValue("-");
                        rowTable.setLine(line);
                        this.st.getRows().add(rowTable);

                    }
                }
                else
                {
                    if(!ctx.line().isEmpty())
                    {

                        List<Line> lines=new ArrayList<>();

                        for (int i=0;i<ctx.line().size();i++)
                        {
                            lines.add(visitLine(ctx.line().get(i)));
                        }
                        voidFunction.setVOID(ctx.VOID().toString());
                        voidFunction.setID(ctx.ID().toString());
                        voidFunction.setStetements(lines);
                        Token idtoken=(Token) ctx.VOID().getSymbol();
                        int line=idtoken.getLine();
                        row_table rowTable=new row_table();
                        rowTable.setType("Function");
                        rowTable.setName(voidFunction.getID());
                        rowTable.setValue("-");
                        rowTable.setLine(line);
                        this.st.getRows().add(rowTable);
                    }
                    else
                    {

                        voidFunction.setVOID(ctx.VOID().toString());
                        voidFunction.setID(ctx.ID().toString());
                        Token idtoken=(Token) ctx.VOID().getSymbol();
                        int line=idtoken.getLine();
                        row_table rowTable=new row_table();
                        rowTable.setType("Function");
                        rowTable.setName(voidFunction.getID());
                        rowTable.setValue("-");
                        rowTable.setLine(line);
                        this.st.getRows().add(rowTable);

                    }
                }
            }
        }
        return voidFunction;

    }

    @Override
    public Type_Function visitTypeFunction(parserproject.TypeFunctionContext ctx) {
        Type_Function typeFunction=new Type_Function();

        if (ctx.ID()!=null)
        {
            if (ctx.INT_TYPE()!=null)
            {
                if(ctx.RETURN()!=null)
                {
                    if(!ctx.parameters().isEmpty())
                    {
                        if(!ctx.line().isEmpty())
                        {
                            List<Parameters> parameters=new ArrayList<>();
                            List<Line> lines=new ArrayList<>();
                            for (int i=0;i<ctx.parameters().size();i++)
                            {
                                parameters.add(visitParameters(ctx.parameters().get(i)));
                            }
                            for (int i=0;i<ctx.line().size();i++)
                            {
                                lines.add(visitLine(ctx.line().get(i)));
                            }
                            typeFunction.setINT_TYPE(ctx.INT_TYPE().toString());
                            typeFunction.setID(ctx.ID().toString());
                            typeFunction.setParameters1(parameters);
                            typeFunction.setStatements1(lines);
                            typeFunction.setRETURN(ctx.RETURN().toString());

                            Token idtoken=(Token) ctx.INT_TYPE().getSymbol();
                            int line=idtoken.getLine();
                            row_table rowTable=new row_table();
                            rowTable.setType("Function"+" "+typeFunction.getINT_TYPE());
                            rowTable.setName(typeFunction.getID());
                            rowTable.setValue("-");
                            rowTable.setLine(line);
                            this.st.getRows().add(rowTable);
                            if(ctx.value1()!=null)
                            {
                                typeFunction.setIntegerValue(visitValue1(ctx.value1()));
                            }
                        }
                        else
                        {
                            List<Parameters> parameters=new ArrayList<>();
                            for (int i=0;i<ctx.parameters().size();i++)
                            {
                                parameters.add(visitParameters(ctx.parameters().get(i)));
                            }

                            typeFunction.setINT_TYPE(ctx.INT_TYPE().toString());
                            typeFunction.setID(ctx.ID().toString());
                            typeFunction.setParameters1(parameters);
                            typeFunction.setRETURN(ctx.RETURN().toString());
                            Token idtoken=(Token) ctx.INT_TYPE().getSymbol();
                            int line=idtoken.getLine();
                            row_table rowTable=new row_table();
                            rowTable.setType("Function"+" "+typeFunction.getINT_TYPE());
                            rowTable.setName(typeFunction.getID());
                            rowTable.setValue("-");
                            rowTable.setLine(line);
                            this.st.getRows().add(rowTable);
                            if(ctx.value1()!=null)
                            {
                                typeFunction.setIntegerValue(visitValue1(ctx.value1()));
                            }
                        }
                    }
                    else
                    {
                        if(!ctx.line().isEmpty())
                        {

                            List<Line> lines=new ArrayList<>();

                            for (int i=0;i<ctx.line().size();i++)
                            {
                                lines.add(visitLine(ctx.line().get(i)));
                            }
                            typeFunction.setINT_TYPE(ctx.INT_TYPE().toString());
                            typeFunction.setID(ctx.ID().toString());
                            typeFunction.setStatements1(lines);
                            typeFunction.setRETURN(ctx.RETURN().toString());
                            Token idtoken=(Token) ctx.INT_TYPE().getSymbol();
                            int line=idtoken.getLine();
                            row_table rowTable=new row_table();
                            rowTable.setType("Function"+" "+typeFunction.getINT_TYPE());
                            rowTable.setName(typeFunction.getID());
                            rowTable.setValue("-");
                            rowTable.setLine(line);
                            this.st.getRows().add(rowTable);
                            if(ctx.value1()!=null)
                            {
                                typeFunction.setIntegerValue(visitValue1(ctx.value1()));
                            }
                        }
                        else
                        {

                            typeFunction.setINT_TYPE(ctx.INT_TYPE().toString());
                            typeFunction.setID(ctx.ID().toString());
                            typeFunction.setRETURN(ctx.RETURN().toString());
                            Token idtoken=(Token) ctx.INT_TYPE().getSymbol();
                            int line=idtoken.getLine();
                            row_table rowTable=new row_table();
                            rowTable.setType("Function"+" "+typeFunction.getINT_TYPE());
                            rowTable.setName(typeFunction.getID());
                            rowTable.setValue("-");
                            rowTable.setLine(line);
                            this.st.getRows().add(rowTable);
                            if(ctx.value1()!=null)
                            {
                                typeFunction.setIntegerValue(visitValue1(ctx.value1()));
                            }

                        }
                    }
                }
                typeFunction.setIntegerValue(visitValue1(ctx.value1()));
            }
            if (ctx.STRING_TYPE()!=null)
            {
                if(ctx.RETURN()!=null)
                {
                    if(!ctx.parameters().isEmpty())
                    {
                        if(!ctx.line().isEmpty())
                        {
                            List<Parameters> parameters=new ArrayList<>();
                            List<Line> lines=new ArrayList<>();
                            for (int i=0;i<ctx.parameters().size();i++)
                            {
                                parameters.add(visitParameters(ctx.parameters().get(i)));
                            }
                            for (int i=0;i<ctx.line().size();i++)
                            {
                                lines.add(visitLine(ctx.line().get(i)));
                            }
                            typeFunction.setSTRING_TYPE(ctx.STRING_TYPE().toString());
                            typeFunction.setID(ctx.ID().toString());
                            typeFunction.setParameters1(parameters);
                            typeFunction.setStatements1(lines);

                            Token idtoken=(Token) ctx.STRING_TYPE().getSymbol();
                            int line=idtoken.getLine();
                            row_table rowTable=new row_table();
                            rowTable.setType("Function"+" "+typeFunction.getSTRING_TYPE());
                            rowTable.setName(typeFunction.getID());
                            rowTable.setValue("-");
                            rowTable.setLine(line);
                            this.st.getRows().add(rowTable);
                            if(ctx.value2()!=null)
                            {
                                typeFunction.setStringValue(visitValue2(ctx.value2()));
                            }
                        }
                        else
                        {
                            List<Parameters> parameters=new ArrayList<>();
                            for (int i=0;i<ctx.parameters().size();i++)
                            {
                                parameters.add(visitParameters(ctx.parameters().get(i)));
                            }

                            typeFunction.setSTRING_TYPE(ctx.STRING_TYPE().toString());
                            typeFunction.setID(ctx.ID().toString());
                            typeFunction.setParameters1(parameters);
                            Token idtoken=(Token) ctx.STRING_TYPE().getSymbol();
                            int line=idtoken.getLine();
                            row_table rowTable=new row_table();
                            rowTable.setType("Function"+" "+typeFunction.getSTRING_TYPE());
                            rowTable.setName(typeFunction.getID());
                            rowTable.setValue("-");
                            rowTable.setLine(line);
                            this.st.getRows().add(rowTable);
                            if(ctx.value1()!=null)
                            {
                                typeFunction.setStringValue(visitValue2(ctx.value2()));
                            }
                        }
                    }
                    else
                    {
                        if(!ctx.line().isEmpty())
                        {

                            List<Line> lines=new ArrayList<>();

                            for (int i=0;i<ctx.line().size();i++)
                            {
                                lines.add(visitLine(ctx.line().get(i)));
                            }
                            typeFunction.setSTRING_TYPE(ctx.STRING_TYPE().toString());
                            typeFunction.setID(ctx.ID().toString());
                            typeFunction.setStatements1(lines);
                            Token idtoken=(Token) ctx.STRING_TYPE().getSymbol();
                            int line=idtoken.getLine();
                            row_table rowTable=new row_table();
                            rowTable.setType("Function"+" "+typeFunction.getSTRING_TYPE());
                            rowTable.setName(typeFunction.getID());
                            rowTable.setValue("-");
                            rowTable.setLine(line);
                            this.st.getRows().add(rowTable);
                            if(ctx.value1()!=null)
                            {
                                typeFunction.setStringValue(visitValue2(ctx.value2()));
                            }
                        }
                        else
                        {

                            typeFunction.setSTRING_TYPE(ctx.STRING_TYPE().toString());
                            typeFunction.setID(ctx.ID().toString());
                            Token idtoken=(Token) ctx.STRING_TYPE().getSymbol();
                            int line=idtoken.getLine();
                            row_table rowTable=new row_table();
                            rowTable.setType("Function"+" "+typeFunction.getSTRING_TYPE());
                            rowTable.setName(typeFunction.getID());
                            rowTable.setValue("-");
                            rowTable.setLine(line);
                            this.st.getRows().add(rowTable);
                            if(ctx.value1()!=null)
                            {
                                typeFunction.setStringValue(visitValue2(ctx.value2()));
                            }

                        }
                    }
                    typeFunction.setRETURN(ctx.RETURN().toString());
                    typeFunction.setStringValue(visitValue2(ctx.value2()));
                }
            }
            if (ctx.BOOL_TYPE()!=null)
            {
                if(ctx.RETURN()!=null)
                {
                    if(!ctx.parameters().isEmpty())
                    {
                        if(!ctx.line().isEmpty())
                        {
                            List<Parameters> parameters=new ArrayList<>();
                            List<Line> lines=new ArrayList<>();
                            for (int i=0;i<ctx.parameters().size();i++)
                            {
                                parameters.add(visitParameters(ctx.parameters().get(i)));
                            }
                            for (int i=0;i<ctx.line().size();i++)
                            {
                                lines.add(visitLine(ctx.line().get(i)));
                            }
                            typeFunction.setBOOL_TYPE(ctx.BOOL_TYPE().toString());
                            typeFunction.setID(ctx.ID().toString());
                            typeFunction.setParameters1(parameters);
                            typeFunction.setStatements1(lines);
                            Token idtoken=(Token) ctx.BOOL_TYPE().getSymbol();
                            int line=idtoken.getLine();
                            row_table rowTable=new row_table();
                            rowTable.setType("Function"+" "+typeFunction.getBOOL_TYPE());
                            rowTable.setName(typeFunction.getID());
                            rowTable.setValue("-");
                            rowTable.setLine(line);
                            this.st.getRows().add(rowTable);
                            if(ctx.value4()!=null)
                            {
                                typeFunction.setBoolValue(visitValue4(ctx.value4()));
                            }
                        }
                        else
                        {
                            List<Parameters> parameters=new ArrayList<>();
                            for (int i=0;i<ctx.parameters().size();i++)
                            {
                                parameters.add(visitParameters(ctx.parameters().get(i)));
                            }

                            typeFunction.setBOOL_TYPE(ctx.BOOL_TYPE().toString());
                            typeFunction.setID(ctx.ID().toString());
                            typeFunction.setParameters1(parameters);
                            Token idtoken=(Token) ctx.BOOL_TYPE().getSymbol();
                            int line=idtoken.getLine();
                            row_table rowTable=new row_table();
                            rowTable.setType("Function"+" "+typeFunction.getBOOL_TYPE());
                            rowTable.setName(typeFunction.getID());
                            rowTable.setValue("-");
                            rowTable.setLine(line);
                            this.st.getRows().add(rowTable);
                            if(ctx.value4()!=null)
                            {
                                typeFunction.setBoolValue(visitValue4(ctx.value4()));
                            }
                        }
                    }
                    else
                    {
                        if(!ctx.line().isEmpty())
                        {

                            List<Line> lines=new ArrayList<>();

                            for (int i=0;i<ctx.line().size();i++)
                            {
                                lines.add(visitLine(ctx.line().get(i)));
                            }
                            typeFunction.setBOOL_TYPE(ctx.BOOL_TYPE().toString());
                            typeFunction.setID(ctx.ID().toString());
                            typeFunction.setStatements1(lines);
                            Token idtoken=(Token) ctx.BOOL_TYPE().getSymbol();
                            int line=idtoken.getLine();
                            row_table rowTable=new row_table();
                            rowTable.setType("Function"+" "+typeFunction.getBOOL_TYPE());
                            rowTable.setName(typeFunction.getID());
                            rowTable.setValue("-");
                            rowTable.setLine(line);
                            this.st.getRows().add(rowTable);
                            if(ctx.value4()!=null)
                            {
                                typeFunction.setBoolValue(visitValue4(ctx.value4()));
                            }
                        }
                        else
                        {

                            typeFunction.setBOOL_TYPE(ctx.BOOL_TYPE().toString());
                            typeFunction.setID(ctx.ID().toString());
                            Token idtoken=(Token) ctx.BOOL_TYPE().getSymbol();
                            int line=idtoken.getLine();
                            row_table rowTable=new row_table();
                            rowTable.setType("Function"+" "+typeFunction.getBOOL_TYPE());
                            rowTable.setName(typeFunction.getID());
                            rowTable.setValue("-");
                            rowTable.setLine(line);
                            this.st.getRows().add(rowTable);
                            if(ctx.value4()!=null)
                            {
                                typeFunction.setBoolValue(visitValue4(ctx.value4()));
                            }

                        }
                    }
                    typeFunction.setRETURN(ctx.RETURN().toString());
                    typeFunction.setBoolValue(visitValue4(ctx.value4()));
                }
            }
            if (ctx.Double_TYPE()!=null)
            {
                if(ctx.RETURN()!=null)
                {
                    if(!ctx.parameters().isEmpty())
                    {
                        if(!ctx.line().isEmpty())
                        {
                            List<Parameters> parameters=new ArrayList<>();
                            List<Line> lines=new ArrayList<>();
                            for (int i=0;i<ctx.parameters().size();i++)
                            {
                                parameters.add(visitParameters(ctx.parameters().get(i)));
                            }
                            for (int i=0;i<ctx.line().size();i++)
                            {
                                lines.add(visitLine(ctx.line().get(i)));
                            }
                            typeFunction.setDouble_TYPE(ctx.Double_TYPE().toString());
                            typeFunction.setID(ctx.ID().toString());
                            typeFunction.setParameters1(parameters);
                            typeFunction.setStatements1(lines);
                            Token idtoken=(Token) ctx.Double_TYPE().getSymbol();
                            int line=idtoken.getLine();
                            row_table rowTable=new row_table();
                            rowTable.setType("Function"+" "+typeFunction.getDouble_TYPE());
                            rowTable.setName(typeFunction.getID());
                            rowTable.setValue("-");
                            rowTable.setLine(line);
                            this.st.getRows().add(rowTable);
                            if(ctx.value3()!=null)
                            {
                                typeFunction.setDoubleValue(visitValue3(ctx.value3()));
                            }
                        }
                        else
                        {
                            List<Parameters> parameters=new ArrayList<>();
                            for (int i=0;i<ctx.parameters().size();i++)
                            {
                                parameters.add(visitParameters(ctx.parameters().get(i)));
                            }

                            typeFunction.setDouble_TYPE(ctx.Double_TYPE().toString());
                            typeFunction.setID(ctx.ID().toString());
                            typeFunction.setParameters1(parameters);
                            Token idtoken=(Token) ctx.Double_TYPE().getSymbol();
                            int line=idtoken.getLine();
                            row_table rowTable=new row_table();
                            rowTable.setType("Function"+" "+typeFunction.getDouble_TYPE());
                            rowTable.setName(typeFunction.getID());
                            rowTable.setValue("-");
                            rowTable.setLine(line);
                            this.st.getRows().add(rowTable);
                            if(ctx.value3()!=null)
                            {
                                typeFunction.setDoubleValue(visitValue3(ctx.value3()));
                            }
                        }
                    }
                    else
                    {
                        if(!ctx.line().isEmpty())
                        {

                            List<Line> lines=new ArrayList<>();

                            for (int i=0;i<ctx.line().size();i++)
                            {
                                lines.add(visitLine(ctx.line().get(i)));
                            }
                            typeFunction.setDouble_TYPE(ctx.Double_TYPE().toString());
                            typeFunction.setID(ctx.ID().toString());
                            typeFunction.setStatements1(lines);
                            Token idtoken=(Token) ctx.Double_TYPE().getSymbol();
                            int line=idtoken.getLine();
                            row_table rowTable=new row_table();
                            rowTable.setType("Function"+" "+typeFunction.getDouble_TYPE());
                            rowTable.setName(typeFunction.getID());
                            rowTable.setValue("-");
                            rowTable.setLine(line);
                            this.st.getRows().add(rowTable);
                            if(ctx.value3()!=null)
                            {
                                typeFunction.setDoubleValue(visitValue3(ctx.value3()));
                            }
                        }
                        else
                        {

                            typeFunction.setDouble_TYPE(ctx.Double_TYPE().toString());
                            typeFunction.setID(ctx.ID().toString());
                            Token idtoken=(Token) ctx.Double_TYPE().getSymbol();
                            int line=idtoken.getLine();
                            row_table rowTable=new row_table();
                            rowTable.setType("Function"+" "+typeFunction.getDouble_TYPE());
                            rowTable.setName(typeFunction.getID());
                            rowTable.setValue("-");
                            rowTable.setLine(line);
                            this.st.getRows().add(rowTable);
                            if(ctx.value3()!=null)
                            {
                                typeFunction.setDoubleValue(visitValue3(ctx.value3()));
                            }

                        }
                    }
                    typeFunction.setRETURN(ctx.RETURN().toString());
                    typeFunction.setDoubleValue(visitValue3(ctx.value3()));
                }
            }
        }

        return typeFunction;


    }

    @Override
    public If_Def visitIfDefinition(parserproject.IfDefinitionContext ctx)
    {
        If_Def if_def=new If_Def();
        if(ctx.condition()!=null)
        {   System.out.println(visitCondition(ctx.condition()).toString());
            if_def.setCondition(visitCondition(ctx.condition()));
            if (!ctx.line().isEmpty())
            {   List<Line> Lines=new ArrayList<>();
                for (int i=0;i<ctx.line().size();i++)
                {
                    Lines.add(visitLine(ctx.line().get(i)));
                }
                if_def.setStatements2(Lines);
            }
            if_def.setIF("if");
        }
        return if_def;
    }


    @Override
    public MULT visitMULT(parserproject.MULTContext ctx)
    {
        Expression left=(Expression) visit(ctx.getChild(0));
        Expression right=(Expression) visit(ctx.getChild(2));
        MULT mult=new MULT(left,right);
        return mult;
    }

    @Override
    public SlashOrDivision visitSlashOrDivision(parserproject.SlashOrDivisionContext ctx)
    {

        Expression left=(Expression) visit(ctx.getChild(0));
        Expression right=(Expression) visit(ctx.getChild(2));
        SlashOrDivision slashOrDivision=new SlashOrDivision(left,right);
        return slashOrDivision;
    }

    @Override
    public SUM visitSUM(parserproject.SUMContext ctx)
    {

        Expression left=(Expression) visit(ctx.getChild(0));
        Expression right=(Expression) visit(ctx.getChild(2));
        SUM sum=new SUM(left,right);
        return sum;
    }

    @Override
    public MINUS visitMINUS(parserproject.MINUSContext ctx)
    {
        Expression left=(Expression) visit(ctx.getChild(0));
        Expression right=(Expression) visit(ctx.getChild(2));
        MINUS minus=new MINUS(left,right);
        return minus;
    }



    @Override
    public For_Def visitForDefinition(parserproject.ForDefinitionContext ctx)
    {
        For_Def for_def=new For_Def();
        for_def.setFor1(visitFor(ctx.for_()));
        return for_def;
    }

    @Override
    public For visitFor(parserproject.ForContext ctx) {
        For forStatements=new For();
        forStatements.setFOR("for");
        forStatements.setValueType(visitVariabelForType(ctx.variabelForType()));
        forStatements.setCondition(visitCondition(ctx.condition()));
        if(ctx.BLUSBLUS()!=null)
        {
            forStatements.setBLUSBLUS(ctx.BLUSBLUS().toString());
        }
        else
        {
            forStatements.setBLUSBLUS(ctx.MINUSMINUS().toString());
        }
        List<Line> statments=new ArrayList<>();
        for(int i=0;i<ctx.line().size();i++)
        {
            statments.add(visitLine(ctx.line().get(i)));
        }
        forStatements.setStatements3(statments);

        return forStatements;


    }

    @Override
    public Line visitLine(parserproject.LineContext ctx)
    {
        Line line=new Line();
        if(ctx.variabelDefinition()!=null)
        {
            line.setVariabelDefinition(visitVariabelDefinition(ctx.variabelDefinition()));
        }
        if(ctx.mapDefinition()!=null)
        {
            line.setMapDefinition(visitMapDefinition(ctx.mapDefinition()));
        }
        if(ctx.functionDefinition()!=null)
        {
            line.setFunctionDefinition(visitFunctionDefinition(ctx.functionDefinition()));
        }
        if(ctx.ifDefinition()!=null)
        {
            line.setIfDefinition(visitIfDefinition(ctx.ifDefinition()));
        }
        if(ctx.exp()!=null)
        {
            line.setExp((Expression) visit(ctx.exp()));
        }
        if(ctx.forDefinition()!=null)
        {
            line.setForDefinition(visitForDefinition(ctx.forDefinition()));
        }
        if(ctx.print()!=null)
        {
            line.setPrint(visitPrint(ctx.print()));
        }
        return line;

    }

    @Override
    public Condition visitCondition(parserproject.ConditionContext ctx) {
        Condition condition=new Condition();
        if(ctx!=null)
        {
            if(ctx.qcOrBig()!=null)
            {

                condition.setQcOrBig(visitQcOrBig(ctx.qcOrBig()));
                return condition;
            }
            if(ctx.qoOrSmal()!=null)
            {

                condition.setQoOrSmal(visitQoOrSmal(ctx.qoOrSmal()));
                return condition;
            }
            if(ctx.smalOrEQUAL()!=null)
            {

                condition.setSmalOrEQUAL(visitSmalOrEQUAL(ctx.smalOrEQUAL()));
                return condition;
            }
            if(ctx.bigOrEQUAL()!=null)
            {

                condition.setBigOrEQUAL(visitBigOrEQUAL(ctx.bigOrEQUAL()));
                return condition;
            }
            if(ctx.equalEqual()!=null)
            {

                condition.setEqualEqual(visitEqualEqual(ctx.equalEqual()));
                return condition;
            }
            if(ctx.notEqual()!=null)
            {

                condition.setNotEqual(visitNotEqual(ctx.notEqual()));
                return condition;
            }

            condition.setVariablecondition(visitVariablecondition(ctx.variablecondition()));
        }

        return condition;

    }
/* @Override
    public Condition visitCondition_Def(parserproject.Condition_DefContext ctx) {
        ctx.
        if(ctx.condition().toString()=="QcOrBig")
        {
            Condition condition=new Condition();
            condition.setQcOrBig(visitQcOrBig((parserproject.QcOrBigContext) ctx.condition()));
            return condition;
        }
        if(ctx.condition().toString()=="QoOrSmal")
        {
            Condition condition=new Condition();
            condition.setQoOrSmal(visitQoOrSmal((parserproject.QoOrSmalContext) ctx.condition()));
            return condition;
        }
        if(ctx.condition().toString()=="SmalOrEQUAL")
        {
            Condition condition=new Condition();
            condition.setSmalOrEQUAL(visitSmalOrEQUAL((parserproject.SmalOrEQUALContext) ctx.condition()));
            return condition;
        }
        if(ctx.condition().toString()=="BigOrEQUAL")
        {
            Condition condition=new Condition();
            condition.setBigOrEQUAL(visitBigOrEQUAL((parserproject.BigOrEQUALContext) ctx.condition()));
            return condition;
        }
        if(ctx.condition().toString()=="EqualEqual")
        {
            Condition condition=new Condition();
            condition.setEqualEqual(visitEqualEqual((parserproject.EqualEqualContext) ctx.condition()));
            return condition;
        }
        if(ctx.condition().toString()=="NotEqual")
        {
            Condition condition=new Condition();
            condition.setNotEqual(visitNotEqual((parserproject.NotEqualContext) ctx.condition()));
            return condition;
        }
        Condition condition=new Condition();
        condition.setVariablecondition(visitVariablecondition((parserproject.VariableconditionContext) ctx.condition()));
        return condition;

    }*/

    @Override
    public QcOrBig visitQcOrBig(parserproject.QcOrBigContext ctx) {
        Expression left=(Expression) visit(ctx.getChild(0));
        Expression right=(Expression) visit(ctx.getChild(2));
        QcOrBig qcOrBig=new QcOrBig(left,right);
        return qcOrBig;
    }

    @Override
    public QoOrSmal visitQoOrSmal(parserproject.QoOrSmalContext ctx) {
        Expression left=(Expression) visit(ctx.getChild(0));
        Expression right=(Expression) visit(ctx.getChild(2));
        QoOrSmal qoOrSmal=new QoOrSmal(left,right);
        return qoOrSmal;
    }

    @Override
    public SmalOrEQUAL visitSmalOrEQUAL(parserproject.SmalOrEQUALContext ctx) {
        Expression left=(Expression) visit(ctx.getChild(0));
        Expression right=(Expression) visit(ctx.getChild(2));
        SmalOrEQUAL smalOrEQUAL=new SmalOrEQUAL(left,right);
        return smalOrEQUAL;
    }

    @Override
    public BigOrEQUAL visitBigOrEQUAL(parserproject.BigOrEQUALContext ctx) {
        Expression left=(Expression) visit(ctx.getChild(0));
        Expression right=(Expression) visit(ctx.getChild(2));
        BigOrEQUAL bigOrEQUAL=new BigOrEQUAL(left,right);
        return bigOrEQUAL;
    }

    @Override
    public EqualEqual visitEqualEqual(parserproject.EqualEqualContext ctx) {
        Expression left=(Expression) visit(ctx.getChild(0));
        Expression right=(Expression) visit(ctx.getChild(2));
        EqualEqual equalEqual=new EqualEqual(left,right);
        return equalEqual;
    }

    @Override
    public NotEqual visitNotEqual(parserproject.NotEqualContext ctx) {
        Expression left=(Expression) visit(ctx.getChild(0));
        Expression right=(Expression) visit(ctx.getChild(2));
        NotEqual notEqual=new NotEqual(left,right);
        return notEqual;
    }

    @Override
    public Variablecondition visitVariablecondition(parserproject.VariableconditionContext ctx) {
        Variablecondition variable=new Variablecondition(visitTrueBoolVar(ctx.trueBoolVar()).toString());
        return variable;
    }

    @Override
    public Variablecondition visitTrueBoolVar(parserproject.TrueBoolVarContext ctx) {
        Variablecondition variable=new Variablecondition(ctx.ID().toString());
        return variable;
    }

    @Override
    public Variable visitVariable(parserproject.VariableContext ctx) {
        Variable variable=null;
        if(ctx!=null)
        {
            if(ctx.ID()!=null)
            {
                variable=new Variable(ctx.ID().toString());
            }
        }


        /*Token idtoken=(Token) ctx.ID().getSymbol();
        int line=idtoken.getLine();
        row_table rowTable=new row_table();
        rowTable.setType("variable");
        rowTable.setValue(variable.toString());//هاد السطر هيك صح؟
        rowTable.setLine(line);
        this.st.getRows().add(rowTable);*/

        return variable;
    }

    @Override
    public Number visitNumber(parserproject.NumberContext ctx) {
        Number num=new Number();
        if(ctx!=null)
        {
            int value=Integer.parseInt(ctx.NUMBER().toString());
            num.setNum(value);

            Token idtoken=(Token) ctx.NUMBER().getSymbol();
            int line=idtoken.getLine();
            row_table rowTable=new row_table();
            rowTable.setType("number");
            rowTable.setValue(String.valueOf(num.getNum()));
            rowTable.setLine(line);
            this.st.getRows().add(rowTable);
        }


        return num;

    }
    @Override
    public variabelForType visitVariabelForType(parserproject.VariabelForTypeContext ctx) {
        variabelForType var=new variabelForType();
        if(ctx.INT_TYPE()!=null)
        {

            //String v=ctx.value1().toString();
            if(ctx.value1()!=null)
            {
                var.setValue1(visitValue1(ctx.value1()));
            }

            String id=ctx.ID().toString();
            var.setID(id);

            Token idtoken=(Token) ctx.INT_TYPE().getSymbol();
            int line=idtoken.getLine();
            row_table rowTable=new row_table();
            rowTable.setType("int");
            rowTable.setName(var.getID());
            if(var.getValue1()!=null)
            {
                rowTable.setValue(String.valueOf(var.getValue1().getNUMBER()));
            }
            else
            {
                rowTable.setValue(" ");
            }

            rowTable.setLine(line);
            this.st.getRows().add(rowTable);
            var.setINT_TYPE("int");
            return var;
        }
        if(ctx.STRING_TYPE()!=null)
        {
            if(ctx.value2()!=null)
            {
                var.setValue2(visitValue2(ctx.value2()));
            }
            String id=ctx.ID().toString();
            var.setID(id);

            Token idtoken=(Token) ctx.STRING_TYPE().getSymbol();
            int line=idtoken.getLine();
            row_table rowTable=new row_table();
            rowTable.setType("String");
            rowTable.setName(var.getID());
            if(var.getValue2()!=null)
            {
                rowTable.setValue(var.getValue2().getSTRING());
            }
            else
            {
                rowTable.setValue(" ");
            }
            rowTable.setLine(line);
            this.st.getRows().add(rowTable);
            var.setSTRING_TYPE("String");
            return var;
        }
        if(ctx.Double_TYPE()!=null)
        {
            if(ctx.value3()!=null)
            {
                var.setValue3(visitValue3(ctx.value3()));
            }
            String id=ctx.ID().toString();
            var.setID(id);

            Token idtoken=(Token) ctx.Double_TYPE().getSymbol();
            int line=idtoken.getLine();
            row_table rowTable=new row_table();
            rowTable.setType("double");
            rowTable.setName(var.getID());
            if(var.getValue3()!=null)
            {
                rowTable.setValue(String.valueOf(var.getValue3().getDoubleNUMBER()));
            }
            else
            {
                rowTable.setValue(" ");
            }

            rowTable.setLine(line);
            this.st.getRows().add(rowTable);
            var.setDouble_TYPE("double");
            return var;
        }
        if(ctx.BOOL_TYPE()!=null)
        {

            if(ctx.value4().TRUE()!=null)
            {
                if(ctx.value4()!=null)
                {
                    var.setValue4(visitValue4(ctx.value4()));
                }
                String id=ctx.ID().toString();
                var.setID(id);

                Token idtoken=(Token) ctx.BOOL_TYPE().getSymbol();
                int line=idtoken.getLine();
                row_table rowTable=new row_table();
                rowTable.setType("boolean");
                rowTable.setName(var.getID());
                if(var.getValue4()!=null)
                {
                    rowTable.setValue(var.getValue4().getTRUE());
                }
                else
                {
                    rowTable.setValue(" ");
                }

                rowTable.setLine(line);
                this.st.getRows().add(rowTable);
                var.setBOOL_TYPE("bool");
                return var;
            }
            if(ctx.value4()!=null)
            {
                var.setValue4(visitValue4(ctx.value4()));
            }
            String id=ctx.ID().toString();
            var.setID(id);

            Token idtoken=(Token) ctx.BOOL_TYPE().getSymbol();
            int line=idtoken.getLine();
            row_table rowTable=new row_table();
            rowTable.setType("boolean");
            rowTable.setName(var.getID());
            if(var.getValue4()!=null)
            {
                rowTable.setValue(var.getValue4().getFALSE());
            }
            else
            {
                rowTable.setValue(" ");
            }

            rowTable.setLine(line);
            this.st.getRows().add(rowTable);
            var.setBOOL_TYPE("bool");
        }
        return var;
    }

    @Override
    public Map_Def visitMapDefinition(parserproject.MapDefinitionContext ctx) {
        Map_Def map_def=new Map_Def();
        Public_Types Type1=visitPublicTyeps(ctx.publicTyeps(0));
        Public_Types Type2=visitPublicTyeps(ctx.publicTyeps(1));

        if(ctx.MAP()!=null)
        {
            if(ctx.ID()!=null)
            {
                switch (Type1.toString())
                {
                    case "int":
                    {
                        List<Integer> KEYS=new ArrayList<>();
                        List<Value> listKye=new ArrayList<>();
                        System.out.println(ctx.valueKey().size());
                        for(int i=0;i<ctx.valueKey().size();i++)
                        {
                            KEYS.add(visitValueKey(ctx.valueKey().get(i)).getNUMBER());
                            Value v=new Value();
                            listKye.add(v);
                            listKye.get(i).setNUMBER(KEYS.get(i));
                        }
                        switch (Type2.toString())
                        {
                            case "String":
                            {
                                List<String> VALUE=new ArrayList<>();
                                List<Value> listValue=new ArrayList<>();
                                for(int i=0;i<ctx.valueValue().size();i++)
                                {
                                    VALUE.add(ctx.valueValue().get(i).STRING().toString());
                                    Value v=new Value();
                                    listValue.add(v);
                                    listValue.get(i).setSTRING(VALUE.get(i));
                                }
                                map_def.setListKey(listKye);
                                map_def.setListvalue(listValue);
                                map_def.setPublicTyeps(Type1);
                                map_def.setPublicTyeps1(Type2);
                                break;
                            }
                            case "bool":
                            {
                                List<Boolean> VALUE=new ArrayList<>();
                                List<Value> listValue=new ArrayList<>();
                                for(int i=0;i<ctx.valueValue().size();i++)
                                {
                                    if(ctx.valueValue().get(i).TRUE()!=null)
                                    {
                                        VALUE.add(Boolean.parseBoolean(ctx.valueValue().get(i).TRUE().toString()));
                                        Value v=new Value();
                                        listValue.add(v);
                                        listValue.get(i).setTRUE(VALUE.get(i).toString());
                                    }
                                    else if(ctx.valueValue().get(i).FALSE()!=null)
                                    {
                                        VALUE.add(Boolean.parseBoolean(ctx.valueValue().get(i).FALSE().toString()));
                                        Value v=new Value();
                                        listValue.add(v);
                                        listValue.get(i).setFLASE(VALUE.get(i).toString());
                                    }

                                }
                                map_def.setListKey(listKye);
                                map_def.setListvalue(listValue);
                                map_def.setPublicTyeps(Type1);
                                map_def.setPublicTyeps1(Type2);
                                break;
                            }
                            case "double":
                            {
                                List<Double> VALUE=new ArrayList<>();
                                List<Value> listValue=new ArrayList<>();
                                for(int i=0;i<ctx.valueValue().size();i++)
                                {
                                    VALUE.add(Double.parseDouble(ctx.valueValue().get(i).DoubleNUMBER().toString()));
                                    Value v=new Value();
                                    listValue.add(v);
                                    listValue.get(i).setDoubleNUMBER(VALUE.get(i));
                                }
                                map_def.setListKey(listKye);
                                map_def.setListvalue(listValue);
                                map_def.setPublicTyeps(Type1);
                                map_def.setPublicTyeps1(Type2);
                                break;
                            }
                            case "int":
                            {
                                List<Integer> VALUE=new ArrayList<>();
                                List<Value> listValue=new ArrayList<>();
                                for(int i=0;i<ctx.valueValue().size();i++)
                                {
                                    VALUE.add(Integer.parseInt(ctx.valueValue().get(i).NUMBER().toString()));
                                    Value v=new Value();
                                    listValue.add(v);
                                    listValue.get(i).setNUMBER(VALUE.get(i));
                                }
                                map_def.setListKey(listKye);
                                map_def.setListvalue(listValue);
                                map_def.setPublicTyeps(Type1);
                                map_def.setPublicTyeps1(Type2);
                                break;
                            }
                        }
                        break;
                    }
                    case "String":
                    {
                        List<String> KEYS=new ArrayList<>();
                        List<Value> listKye=new ArrayList<>();
                        for(int i=0;i<ctx.valueKey().size();i++)
                        {
                            KEYS.add(ctx.valueKey().get(i).NUMBER().toString());
                            Value v=new Value();
                            listKye.add(v);
                            listKye.get(i).setSTRING(KEYS.get(i));
                        }
                        switch (Type2.toString())
                        {
                            case "String":
                            {
                                List<String> VALUE=new ArrayList<>();
                                List<Value> listValue=new ArrayList<>();
                                for(int i=0;i<ctx.valueValue().size();i++)
                                {
                                    VALUE.add(ctx.valueValue().get(i).STRING().toString());
                                    Value v=new Value();
                                    listValue.add(v);
                                    listValue.get(i).setSTRING(VALUE.get(i));
                                }
                                map_def.setListKey(listKye);
                                map_def.setListvalue(listValue);
                                map_def.setPublicTyeps(Type1);
                                map_def.setPublicTyeps1(Type2);
                                break;
                            }
                            case "bool":
                            {
                                List<Boolean> VALUE=new ArrayList<>();
                                List<Value> listValue=new ArrayList<>();
                                for(int i=0;i<ctx.valueValue().size();i++)
                                {
                                    if(ctx.valueValue().get(i).TRUE()!=null)
                                    {
                                        VALUE.add(Boolean.parseBoolean(ctx.valueValue().get(i).TRUE().toString()));
                                        Value v=new Value();
                                        listValue.add(v);
                                        listValue.get(i).setTRUE(VALUE.get(i).toString());
                                    }
                                    else if(ctx.valueValue().get(i).FALSE()!=null)
                                    {
                                        VALUE.add(Boolean.parseBoolean(ctx.valueValue().get(i).FALSE().toString()));
                                        Value v=new Value();
                                        listValue.add(v);
                                        listValue.get(i).setFLASE(VALUE.get(i).toString());
                                    }

                                }
                                map_def.setListKey(listKye);
                                map_def.setListvalue(listValue);
                                map_def.setPublicTyeps(Type1);
                                map_def.setPublicTyeps1(Type2);
                                break;
                            }
                            case "double":
                            {
                                List<Double> VALUE=new ArrayList<>();
                                List<Value> listValue=new ArrayList<>();
                                for(int i=0;i<ctx.valueValue().size();i++)
                                {
                                    VALUE.add(Double.parseDouble(ctx.valueValue().get(i).DoubleNUMBER().toString()));
                                    Value v=new Value();
                                    listValue.add(v);
                                    listValue.get(i).setDoubleNUMBER(VALUE.get(i));
                                }
                                map_def.setListKey(listKye);
                                map_def.setListvalue(listValue);
                                map_def.setPublicTyeps(Type1);
                                map_def.setPublicTyeps1(Type2);
                                break;
                            }
                            case "int":
                            {
                                List<Integer> VALUE=new ArrayList<>();
                                List<Value> listValue=new ArrayList<>();
                                for(int i=0;i<ctx.valueValue().size();i++)
                                {
                                    VALUE.add(Integer.parseInt(ctx.valueValue().get(i).NUMBER().toString()));
                                    Value v=new Value();
                                    listValue.add(v);
                                    listValue.get(i).setNUMBER(VALUE.get(i));
                                }
                                map_def.setListKey(listKye);
                                map_def.setListvalue(listValue);
                                map_def.setPublicTyeps(Type1);
                                map_def.setPublicTyeps1(Type2);
                                break;
                            }
                        }
                        break;
                    }
                    case "double":
                    {
                        List<Double> KEYS=new ArrayList<>();
                        List<Value> listKye=new ArrayList<>();
                        for(int i=0;i<ctx.valueKey().size();i++)
                        {
                            KEYS.add(Double.parseDouble(ctx.valueKey().get(i).DoubleNUMBER().toString()));
                            Value v=new Value();
                            listKye.add(v);
                            listKye.get(i).setDoubleNUMBER(KEYS.get(i));
                        }
                        switch (Type2.toString())
                        {
                            case "String":
                            {
                                List<String> VALUE=new ArrayList<>();
                                List<Value> listValue=new ArrayList<>();
                                for(int i=0;i<ctx.valueValue().size();i++)
                                {
                                    VALUE.add(ctx.valueValue().get(i).STRING().toString());
                                    Value v=new Value();
                                    listValue.add(v);
                                    listValue.get(i).setSTRING(VALUE.get(i));
                                }
                                map_def.setListKey(listKye);
                                map_def.setListvalue(listValue);
                                map_def.setPublicTyeps(Type1);
                                map_def.setPublicTyeps1(Type2);
                                break;
                            }
                            case "bool":
                            {
                                List<Boolean> VALUE=new ArrayList<>();
                                List<Value> listValue=new ArrayList<>();
                                for(int i=0;i<ctx.valueValue().size();i++)
                                {
                                    if(ctx.valueValue().get(i).TRUE()!=null)
                                    {
                                        VALUE.add(Boolean.parseBoolean(ctx.valueValue().get(i).TRUE().toString()));
                                        Value v=new Value();
                                        listValue.add(v);
                                        listValue.get(i).setTRUE(VALUE.get(i).toString());
                                    }
                                    else if(ctx.valueValue().get(i).FALSE()!=null)
                                    {
                                        VALUE.add(Boolean.parseBoolean(ctx.valueValue().get(i).FALSE().toString()));
                                        Value v=new Value();
                                        listValue.add(v);
                                        listValue.get(i).setFLASE(VALUE.get(i).toString());
                                    }

                                }
                                map_def.setListKey(listKye);
                                map_def.setListvalue(listValue);
                                map_def.setPublicTyeps(Type1);
                                map_def.setPublicTyeps1(Type2);
                                break;
                            }
                            case "double":
                            {
                                List<Double> VALUE=new ArrayList<>();
                                List<Value> listValue=new ArrayList<>();
                                for(int i=0;i<ctx.valueValue().size();i++)
                                {
                                    VALUE.add(Double.parseDouble(ctx.valueValue().get(i).DoubleNUMBER().toString()));
                                    Value v=new Value();
                                    listValue.add(v);
                                    listValue.get(i).setDoubleNUMBER(VALUE.get(i));
                                }
                                map_def.setListKey(listKye);
                                map_def.setListvalue(listValue);
                                map_def.setPublicTyeps(Type1);
                                map_def.setPublicTyeps1(Type2);
                                break;
                            }
                            case "int":
                            {
                                List<Integer> VALUE=new ArrayList<>();
                                List<Value> listValue=new ArrayList<>();
                                for(int i=0;i<ctx.valueValue().size();i++)
                                {
                                    VALUE.add(Integer.parseInt(ctx.valueValue().get(i).NUMBER().toString()));
                                    Value v=new Value();
                                    listValue.add(v);
                                    listValue.get(i).setNUMBER(VALUE.get(i));
                                }
                                map_def.setListKey(listKye);
                                map_def.setListvalue(listValue);
                                map_def.setPublicTyeps(Type1);
                                map_def.setPublicTyeps1(Type2);
                                break;
                            }
                        }
                        break;
                    }
                    case "bool":
                    {
                        List<Boolean> KEYS=new ArrayList<>();
                        List<Value> listKye=new ArrayList<>();
                        for(int i=0;i<ctx.valueKey().size();i++)
                        {
                            if(ctx.valueKey().get(i).TRUE()!=null)
                            {
                                KEYS.add(Boolean.parseBoolean(ctx.valueKey().get(i).TRUE().toString()));
                                Value v=new Value();
                                listKye.add(v);
                                listKye.get(i).setTRUE(KEYS.get(i).toString());
                            }
                            else if(ctx.valueKey().get(i).FALSE()!=null)
                            {
                                KEYS.add(Boolean.parseBoolean(ctx.valueKey().get(i).FALSE().toString()));
                                Value v=new Value();
                                listKye.add(v);
                                listKye.get(i).setFLASE(KEYS.get(i).toString());
                            }
                        }
                        switch (Type2.toString())
                        {
                            case "String":
                            {
                                List<String> VALUE=new ArrayList<>();
                                List<Value> listValue=new ArrayList<>();
                                for(int i=0;i<ctx.valueValue().size();i++)
                                {
                                    VALUE.add(ctx.valueValue().get(i).STRING().toString());
                                    Value v=new Value();
                                    listValue.add(v);
                                    listValue.get(i).setSTRING(VALUE.get(i));
                                }
                                map_def.setListKey(listKye);
                                map_def.setListvalue(listValue);
                                map_def.setPublicTyeps(Type1);
                                map_def.setPublicTyeps1(Type2);
                                break;
                            }
                            case "bool":
                            {
                                List<Boolean> VALUE=new ArrayList<>();
                                List<Value> listValue=new ArrayList<>();
                                for(int i=0;i<ctx.valueValue().size();i++)
                                {
                                    if(ctx.valueValue().get(i).TRUE()!=null)
                                    {
                                        VALUE.add(Boolean.parseBoolean(ctx.valueValue().get(i).TRUE().toString()));
                                        Value v=new Value();
                                        listValue.add(v);
                                        listValue.get(i).setTRUE(VALUE.get(i).toString());
                                    }
                                    else if(ctx.valueValue().get(i).FALSE()!=null)
                                    {
                                        VALUE.add(Boolean.parseBoolean(ctx.valueValue().get(i).FALSE().toString()));
                                        Value v=new Value();
                                        listValue.add(v);
                                        listValue.get(i).setFLASE(VALUE.get(i).toString());
                                    }

                                }
                                map_def.setListKey(listKye);
                                map_def.setListvalue(listValue);
                                map_def.setPublicTyeps(Type1);
                                map_def.setPublicTyeps1(Type2);
                                break;
                            }
                            case "double":
                            {
                                List<Double> VALUE=new ArrayList<>();
                                List<Value> listValue=new ArrayList<>();
                                for(int i=0;i<ctx.valueValue().size();i++)
                                {
                                    VALUE.add(Double.parseDouble(ctx.valueValue().get(i).DoubleNUMBER().toString()));
                                    Value v=new Value();
                                    listValue.add(v);
                                    listValue.get(i).setDoubleNUMBER(VALUE.get(i));
                                }
                                map_def.setListKey(listKye);
                                map_def.setListvalue(listValue);
                                map_def.setPublicTyeps(Type1);
                                map_def.setPublicTyeps1(Type2);
                                break;
                            }
                            case "int":
                            {
                                List<Integer> VALUE=new ArrayList<>();
                                List<Value> listValue=new ArrayList<>();
                                for(int i=0;i<ctx.valueValue().size();i++)
                                {
                                    VALUE.add(Integer.parseInt(ctx.valueValue().get(i).NUMBER().toString()));
                                    Value v=new Value();
                                    listValue.add(v);
                                    listValue.get(i).setNUMBER(VALUE.get(i));
                                }
                                map_def.setListKey(listKye);
                                map_def.setListvalue(listValue);
                                map_def.setPublicTyeps(Type1);
                                map_def.setPublicTyeps1(Type2);
                                break;
                            }
                        }
                        break;
                    }
                }
                  map_def.setID(ctx.ID().toString());
                Token idtoken=(Token) ctx.MAP().getSymbol();
                int line=idtoken.getLine();
                row_table rowTable=new row_table();
                rowTable.setType("Map <"+map_def.getPublicTyeps().toString()+","+map_def.getPublicTyeps1().toString()+">");
                rowTable.setName(map_def.getID());
                rowTable.setValue(map_def.getValue());
                rowTable.setLine(line);
                this.st.getRows().add(rowTable);
            }
        }
        return map_def;

    }

    @Override
    public Value visitValueKey(parserproject.ValueKeyContext ctx) {
        Value value=new Value();

        if(ctx.STRING()!=null)
        {
            value.setSTRING(ctx.STRING().toString());
        }
        if(ctx.TRUE()!=null)
        {
            value.setTRUE(ctx.TRUE().toString());
        }
        if(ctx.FALSE()!=null)
        {
            value.setFLASE(ctx.FALSE().toString());
        }
        if(ctx.NULL()!=null)
        {
            value.setNULL(ctx.NULL().toString());
        }
        if(ctx.NUMBER()!=null)
        {
            value.setNUMBER(Integer.parseInt(ctx.NUMBER().toString()));
        }
        if(ctx.DoubleNUMBER()!=null)
        {
            value.setDoubleNUMBER(Double.parseDouble(ctx.DoubleNUMBER().toString()));
        }
        return value;
    }

    @Override
    public Value visitValueValue(parserproject.ValueValueContext ctx) {
        Value value=new Value();
        String string =ctx.STRING().toString();
        String TRUE =ctx.TRUE().toString();
        String FALSE=ctx.FALSE().toString();
        String Null=ctx.NULL().toString();
        String Number=ctx.NUMBER().toString();
        String Double=ctx.DoubleNUMBER().toString();
        if(string!=null)
        {
            value.setSTRING(string);
        }
        if(TRUE!=null)
        {
            value.setTRUE(TRUE);
        }
        if(FALSE!=null)
        {
            value.setFLASE(FALSE);
        }
        if(Null!=null)
        {
            value.setNULL(Null);
        }
        if(Number!=null)
        {
            value.setNUMBER(Integer.parseInt(Number));
        }
        if(Double!=null)
        {
            value.setDoubleNUMBER(java.lang.Double.parseDouble(Double));
        }
        return value;
    }

    @Override
    public Parameters visitParameters(parserproject.ParametersContext ctx) {
        Parameters parameters=new Parameters();
        if(ctx.publicTyeps()!=null)
        {
            if(ctx.ID()!=null)
            {
                parameters.setPublicTyeps(visitPublicTyeps(ctx.publicTyeps()));
                parameters.setID(ctx.ID().toString());
            }
        }
        return parameters;
    }

    @Override
    public Public_Types visitPublicTyeps(parserproject.PublicTyepsContext ctx) {
        Public_Types public_types=new Public_Types();
        if(ctx.INT_TYPE()!=null)
        {
            System.out.println("555555555555555555555555  "+ctx.INT_TYPE().toString());
            public_types.setINT_TYPE(ctx.INT_TYPE().toString());
            return public_types;
        }
        if(ctx.BOOL_TYPE()!=null)
        {
            public_types.setBOOL_TYPE(ctx.BOOL_TYPE().toString());
            return public_types;
        }
        if(ctx.STRING_TYPE()!=null)
        {
            public_types.setSTRING_TYPE(ctx.STRING_TYPE().toString());
            return public_types;
        }
        public_types.setDouble_TYPE(ctx.Double_TYPE().toString());
        return public_types;
    }

    @Override
    public Print visitPrint(parserproject.PrintContext ctx) {
        Print print=new Print();
        List<Value> LIST=new ArrayList<>();
        if(ctx.PRINT()!=null)
        {
            if(ctx.value()!=null)
            {

                for(int i=0;i<ctx.value().size();i++)
                {
                    LIST.add(visitValue(ctx.value().get(i)));
                }
            }
        }
        print.setPrintlist(LIST);
        return print;
    }

    @Override
    public L_O_F visitLeteOrFinal(parserproject.LeteOrFinalContext ctx) {
        L_O_F leteOrFinal=new L_O_F();
        if(ctx.LATE()!=null)
        {
            if(ctx.varOrType()!=null)
            {
                leteOrFinal.setLATE(ctx.LATE().toString());
                leteOrFinal.setVarOrType(visitVarOrType(ctx.varOrType()));
                return leteOrFinal;
            }
            else if(ctx.listType()!=null){
                leteOrFinal.setLATE(ctx.LATE().toString());
                leteOrFinal.setListType(visitListType(ctx.listType()));
                return leteOrFinal;
            }
        }
        if(ctx.FINAL()!=null)
        {
            if(ctx.lineWithType()!=null)
            {
                leteOrFinal.setFINAL(ctx.FINAL().toString());
                leteOrFinal.setLineWithType(visitLineWithType(ctx.lineWithType()));
                return leteOrFinal;
            }
            else if(ctx.listType()!=null){
                leteOrFinal.setFINAL(ctx.FINAL().toString());
                leteOrFinal.setListType(visitListType(ctx.listType()));
                return leteOrFinal;
            }
        } else if ((ctx.LATE()!=null)&&(ctx.FINAL()!=null)) {
            if(ctx.lineWithType()!=null)
            {
                leteOrFinal.setLATE(ctx.LATE().toString());
                leteOrFinal.setFINAL(ctx.FINAL().toString());
                leteOrFinal.setLineWithType(visitLineWithType(ctx.lineWithType()));
                return leteOrFinal;
            }
            else if(ctx.listType()!=null){
                leteOrFinal.setLATE(ctx.LATE().toString());
                leteOrFinal.setFINAL(ctx.FINAL().toString());
                leteOrFinal.setListType(visitListType(ctx.listType()));
                return leteOrFinal;
            }


        }
        else if ((ctx.LATE()==null)&&(ctx.FINAL()==null)) {
            if(ctx.lineWithType()!=null)
            {

                leteOrFinal.setLineWithType(visitLineWithType(ctx.lineWithType()));
                return leteOrFinal;
            }
            else if(ctx.listType()!=null){

                leteOrFinal.setListType(visitListType(ctx.listType()));
                return leteOrFinal;
            } else if (ctx.varOrType()!=null) {
                leteOrFinal.setVarOrType(visitVarOrType(ctx.varOrType()));

            }


        }
        return leteOrFinal;

    }

    @Override
    public Var_or_Typr visitVarOrType(parserproject.VarOrTypeContext ctx) {
        Var_or_Typr var_or_typr=new Var_or_Typr();
        if(ctx.lineWithType().toString()!=null)
        {
            System.out.println("///////////////////////////////////////////  "+visitLineWithType(ctx.lineWithType()).toString());
            var_or_typr.setLineWithType(visitLineWithType(ctx.lineWithType()));
            return var_or_typr;
        }
        var_or_typr.setVAR(ctx.VAR().toString());
        var_or_typr.setValue(visitValue(ctx.value()));
        var_or_typr.setID(ctx.ID().toString());
        Token idtoken=(Token) ctx.VAR().getSymbol();
        int line=idtoken.getLine();
        row_table rowTable=new row_table();
        rowTable.setType("Var");
        rowTable.setName(var_or_typr.getID());
        rowTable.setValue(var_or_typr.getValue().toString());
        rowTable.setLine(line);
        this.st.getRows().add(rowTable);
        return var_or_typr;
    }

    @Override
    public VarsWithType visitLineWithType(parserproject.LineWithTypeContext ctx) {
        VarsWithType var=new VarsWithType();
        if(ctx.INT_TYPE()!=null)
        {
            System.out.println("88888888888888888888888888888888888888888888888888888888888888");
            //String v=ctx.value1().toString();
            if(ctx.value1()!=null)
            {
                var.setValue1(visitValue1(ctx.value1()));
            }

            String id=ctx.ID().toString();
            var.setID(id);

            Token idtoken=(Token) ctx.INT_TYPE().getSymbol();
            int line=idtoken.getLine();
            row_table rowTable=new row_table();
            rowTable.setType("int");
            rowTable.setName(var.getID());
            if(var.getValue1()!=null)
            {
                rowTable.setValue(String.valueOf(var.getValue1().getNUMBER()));
            }
            else
            {
                rowTable.setValue(" ");
            }

            rowTable.setLine(line);
            this.st.getRows().add(rowTable);
            var.setINT_TYPE("int");
            return var;
        }
        if(ctx.STRING_TYPE()!=null)
        {
            if(ctx.value2()!=null)
            {
                var.setValue2(visitValue2(ctx.value2()));
            }
            String id=ctx.ID().toString();
            var.setID(id);

            Token idtoken=(Token) ctx.STRING_TYPE().getSymbol();
            int line=idtoken.getLine();
            row_table rowTable=new row_table();
            rowTable.setType("String");
            rowTable.setName(var.getID());
            if(var.getValue2()!=null)
            {
                rowTable.setValue(var.getValue2().getSTRING());
            }
            else
            {
                rowTable.setValue(" ");
            }
            rowTable.setLine(line);
            this.st.getRows().add(rowTable);
            var.setSTRING_TYPE("String");
            return var;
        }
        if(ctx.Double_TYPE()!=null)
        {
            if(ctx.value3()!=null)
            {
                var.setValue3(visitValue3(ctx.value3()));
            }
            String id=ctx.ID().toString();
            var.setID(id);

            Token idtoken=(Token) ctx.Double_TYPE().getSymbol();
            int line=idtoken.getLine();
            row_table rowTable=new row_table();
            rowTable.setType("double");
            rowTable.setName(var.getID());
            if(var.getValue3()!=null)
            {
                rowTable.setValue(String.valueOf(var.getValue3().getDoubleNUMBER()));
            }
            else
            {
                rowTable.setValue(" ");
            }

            rowTable.setLine(line);
            this.st.getRows().add(rowTable);
            var.setDouble_TYPE("double");
            return var;
        }
        if(ctx.BOOL_TYPE()!=null)
        {

            if(ctx.value4().TRUE()!=null)
            {
                if(ctx.value4()!=null)
                {
                    var.setValue4(visitValue4(ctx.value4()));
                }
                String id=ctx.ID().toString();
                var.setID(id);

                Token idtoken=(Token) ctx.BOOL_TYPE().getSymbol();
                int line=idtoken.getLine();
                row_table rowTable=new row_table();
                rowTable.setType("boolean");
                rowTable.setName(var.getID());
                if(var.getValue4()!=null)
                {
                    rowTable.setValue(var.getValue4().getTRUE());
                }
                else
                {
                    rowTable.setValue(" ");
                }

                rowTable.setLine(line);
                this.st.getRows().add(rowTable);
                var.setBOOL_TYPE("bool");
                return var;
            }
            if(ctx.value4()!=null)
            {
                var.setValue4(visitValue4(ctx.value4()));
            }
            String id=ctx.ID().toString();
            var.setID(id);

            Token idtoken=(Token) ctx.BOOL_TYPE().getSymbol();
            int line=idtoken.getLine();
            row_table rowTable=new row_table();
            rowTable.setType("boolean");
            rowTable.setName(var.getID());
            if(var.getValue4()!=null)
            {
                rowTable.setValue(var.getValue4().getFALSE());
            }
            else
            {
                rowTable.setValue(" ");
            }

            rowTable.setLine(line);
            this.st.getRows().add(rowTable);
            var.setBOOL_TYPE("bool");
        }


        return var;


    }

    @Override
    public List_Type visitListType(parserproject.ListTypeContext ctx) {
        List_Type list_type=new List_Type();
        //String type=ctx.getChild(2).toString();
        if(ctx.INT_TYPE()!=null)
        {
           System.out.println("LIST wASEM ***********************************************");
            List<Value_1> LIST=new ArrayList<>();
            for(int i=0;i<ctx.value1().size();i++)
            {
                Value_1 value=new Value_1();
                value.setNUMBER(visitValue1(ctx.value1().get(i)).getNUMBER());
                System.out.println(" //"+visitValue1(ctx.value1().get(i)).getNUMBER());
                LIST.add(value);

            }
            list_type.setValue1(LIST);
            System.out.println(list_type.getValue1());
            list_type.setID(ctx.ID().toString());
            Token idtoken=(Token) ctx.LIST().getSymbol();
            int line=idtoken.getLine();
            row_table rowTable=new row_table();
            rowTable.setType("List int");
            rowTable.setName(ctx.ID().toString());
            rowTable.setValue(list_type.getValue1().toString());
            rowTable.setLine(line);
            this.st.getRows().add(rowTable);
            return list_type;
        }
        if(ctx.Double_TYPE()!=null)
        {

            List<Value_3> LIST=new ArrayList<>();
            for(int i=0;i<ctx.value3().size();i++)
            {
                Value_3 value=new Value_3();
                value.setDoubleNUMBER(Double.parseDouble(ctx.value1().get(i).toString()));
                LIST.add(value);
            }
            list_type.setValue3(LIST);
            return list_type;
        }
        if(ctx.STRING_TYPE()!=null)
        {

            List<Value_2> LIST=new ArrayList<>();
            for(int i=0;i<ctx.value2().size();i++)
            {
                Value_2 value=new Value_2();
                value.setSTRING(ctx.value1().get(i).toString());
                LIST.add(value);
            }
            list_type.setValue2(LIST);
            return list_type;
        }


        List<Value_4> LIST=new ArrayList<>();
        for(int i=0;i<ctx.value4().size();i++)
        {
            Value_4 value=new Value_4();
            if(ctx.value4().get(i).TRUE()!=null)
            {
                value.setTRUE(ctx.value4().get(i).toString());
                LIST.add(value);
            }
            else
            {
                value.setFALSE(ctx.value4().get(i).toString());
                LIST.add(value);
            }
        }
        list_type.setValue4(LIST);
        return list_type;

    }

    @Override
    public Value visitValue(parserproject.ValueContext ctx) {
        Value value=new Value();
        if(ctx!=null)
        {






            if(ctx.STRING()!=null)
            {
                String string =ctx.STRING().toString();
                value.setSTRING(string);
            }
            if(ctx.TRUE()!=null)
            {
                String TRUE =ctx.TRUE().toString();
                value.setTRUE(TRUE);
            }
            if(ctx.FALSE()!=null)
            {
                String FALSE=ctx.FALSE().toString();
                value.setFLASE(FALSE);
            }
            if(ctx.NULL()!=null)
            {
                String Null=ctx.NULL().toString();
                value.setNULL(Null);
            }
            if(ctx.NUMBER()!=null)
            {
                String number=ctx.NUMBER().toString();
                value.setNUMBER(Integer.parseInt(number));
            }
            if(ctx.DoubleNUMBER()!=null)
            {
                String doubleNumber=ctx.DoubleNUMBER().toString();
                value.setDoubleNUMBER(Double.parseDouble(doubleNumber));
            }
        }

        return value;
    }

    @Override
    public Value_1 visitValue1(parserproject.Value1Context ctx) {
        Value_1 value=new Value_1();
        String INTNumber=ctx.NUMBER().toString();
        if(INTNumber!=null)
        {
            value.setNUMBER(Integer.parseInt(INTNumber));
        }
        return value;
    }

    @Override
    public Value_2 visitValue2(parserproject.Value2Context ctx) {
        Value_2 value=new Value_2();
        String string=ctx.STRING().toString();
        if(string!=null)
        {
            value.setSTRING(string);
        }
        return value;
    }

    @Override
    public Value_3 visitValue3(parserproject.Value3Context ctx) {
        Value_3 value=new Value_3();
        String DoubleNumber=ctx.DoubleNUMBER().toString();
        if(DoubleNumber!=null)
        {
            value.setDoubleNUMBER(Double.parseDouble(DoubleNumber));
        }
        return value;
    }

    @Override
    public Value_4 visitValue4(parserproject.Value4Context ctx) {
        Value_4 value=new Value_4();
        if(ctx!=null)
        {


            if(ctx.TRUE()!=null)
            {String VTRUE=ctx.TRUE().toString();
                value.setTRUE(VTRUE);
            }
            if(ctx.FALSE()!=null)
            {
                String VFALSE=ctx.FALSE().toString();
                value.setFALSE(VFALSE);
            }
        }


        return value;

    }
}
