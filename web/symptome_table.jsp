<!--entete_document start-->
<%@include file="entete_document.jsp" %>
<!--entete_document end-->
<body>
<section id="container">
<!--header start-->
<%@include file="header.jsp" %>
<!--sidebar start-->
<%@include file="sidebar.jsp" %>
<!--sidebar end-->
<!--main content start-->
<section id="main-content">
	<section class="wrapper">
			
            <!-- page start-->
            <div class="row" >
                <div class="col-lg-12">
                    <section class="panel">
                        <header class="panel-heading">
                            Formulaire Enregistrement
                            <span class="tools pull-right">
                                <a class="fa fa-chevron-down" href="javascript:;"></a>
                                <a class="fa fa-cog" href="javascript:;"></a>
                                <a class="fa fa-times" href="javascript:;"></a>
                             </span>
                        </header>
                        <div class="panel-body">
                            <form role="form" class="form-horizontal" method="post" action="SymptomeController">
                            	<c:if test="${mode=='editer'}">
                            		<div class="form-group has-primary">
	                                    <div class="col-lg-6">
                                        <input type="hidden" placeholder="" id="f-name"  value ="${id }" class="form-control" name="id">
                                        
                                    </div>
                                  </div>
                            	</c:if>
                            	 
                                <div class="form-group has-primary">
                                    <label class="col-lg-3 control-label">Nom</label>
                                    <div class="col-lg-6">
                                        <input type="text" placeholder="" id="f-name" value ="${nom }" class="form-control" name="nom">
                                        <p class="help-block">entrer le nom </p>
                                        
                                    </div>
                                </div>
                               <div class="form-group has-primary">
                                    <label class="col-lg-3 control-label">Description</label>
                                    <div class="col-lg-6">
                                        <input type="text" placeholder="" id="f-name" class="form-control" value ="${description }" name="description">
                                        <p class="help-block">entrer la description</p>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <div class="col-lg-offset-3 col-lg-6">
                                       <c:if test="${mode=='ajouter'}">
                                       		<button class="btn btn-primary" type="submit" value="ajouter" name="action">Ajouter</button>
                                       </c:if>
                                        <c:if test="${mode=='editer'}">
                                       		<button class="btn btn-primary" type="submit" value="editer" name="action">Modifier</button>
                                       </c:if>
                                       
                                    </div>
                                </div>
                            </form>
                            
                        </div>
                    </section>
                </div>
            </div>

		<div class="table-agile-info">
		<a href="SymptomeController?mode=ajouter" class="btn btn-success">Nouveau Symptome</a>
   <div class="panel panel-default">
    <div class="panel-heading">
     Affichage Des symptomes
    </div>
    <div>
      <table class="table table-hover" ui-jq="footable" ui-options='{
        "paging": {
          "enabled": true
        },
        "filtering": {
          "enabled": true
        },
        "sorting": {
          "enabled": true
        }}'>
        <thead>
          <tr>
            <th data-breakpoints="xs" width="20%">ID</th>
            <th width="30%">Nom</th>
            <th width="30%">Description</th>
            <th width="20%">Action</th>
          </tr>
        </thead>
        <tbody>
        	<c:forEach items="${list }" var="symp" varStatus="status">
        		<tr>
        			<td> <c:out value="${ symp.id }" /></td>
        			<td align="justify"> <c:out value="${ symp.nom }" /></td>
        			<td> <c:out value="${ symp.description }" /></td>
        			<td> <a href="SymptomeController?action=delete&id=${symp.id }" class="btn btn-danger btn-sm">Supprimer</a></td>
        			<td> <a href="SymptomeController?mode=editer&id=${symp.id }&nom=${symp.nom}&description=${symp.description}" class="btn btn-info btn-sm">Modifier</a></td>
        		</tr>
			</c:forEach>
        </tbody>
      </table>
    </div>
  </div>
</div>
<!--footer start-->
<%@include file="footer.jsp" %>
<!--footer end-->
</section>

</section>

<!--main content end-->
</section>
<!--appel des scripts start-->
<%@include file="fichier_script.html" %>
<!--appels script end-->
</body>
</html>
