<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:template title="Create Lot">
    <div class="centered-form">
        <div class="form-card">
            <h2 class="centered-title">Create New Lot</h2>
                     <form action="${pageContext.request.contextPath}/lot" method="post" autocomplete="off">
                <input type="hidden" name="action" value="create"/>
                <div class="form-group">
                    <label for="title" class="form-label">Title:</label>
                    <input type="text" id="title" name="title" class="form-input" required>
                </div>
                <div class="form-group">
                    <label for="description" class="form-label">Description:</label>
                    <textarea id="description" name="description" class="form-input textarea" rows="7" style="resize:vertical; min-height: 120px; max-height: 220px;" required></textarea>
                </div>
                <div class="form-group">
                    <label for="startPrice" class="form-label">Starting Price:</label>
                    <input type="number" min="0" step="0.01" id="startPrice" name="startPrice" class="form-input" required>
                </div>
                <div class="form-actions-row">
                    <button type="submit" class="button blue half-width">Create Lot</button>
                    <a href="${pageContext.request.contextPath}/" class="button red half-width">Cancel</a>
                </div>
            </form>
        </div>
    </div>
</t:template>