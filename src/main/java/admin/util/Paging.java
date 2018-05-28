package admin.util;

public class Paging {
	private int curPage;	//���� ������ ��ȣ (���� ������ ������)

	private int totalCount;	//�� �Խñ� �� (DB ��ȸ ����� ����)
	private int listCount;	//�� �������� ��µ� �Խñ� �� (���� ������)
	private int totalPage;	//�� ������ �� (������� �˾Ƴ�)

	private int pageCount;	//�� ȭ�鿡 ��µ� ������ �� (���� ������)
	private int startPage;	//ȭ�鿡 ���̴� ���� ������ (������� �˾Ƴ�)
	private int endPage;	//ȭ�鿡 ���̴� �� ������ (������� �˾Ƴ�)
	
	private int startNo;	//�Խù�����Ʈ ù ��ȣ
	private int endNo;	//�Խù�����Ʈ ������ ��ȣ
	private String search;
	
	// �� �Խñ� ���� �Է��ϴ� ������
	//	curPage == 1
	//	pageCount == 10
	//	listCount == 10
	public Paging() {
		this.setTotalCount(0);

	}
	
	public Paging(int totalCount) {
		this.setTotalCount(totalCount);
		
		makePaging();
	}

	// �� �Խñ� ���� ���� �������� �Է��ϴ� ������
	//	pageCount == 10
	//	listCount == 10
	public Paging(int totalCount, int curPage) {
		this(totalCount);
		this.setCurPage(curPage);
		
		makePaging();
	}

	// �� �Խñ� ���� ���� ������, �������� �Խñ� ���� �Է��ϴ� ������
	//	listCount == 10
	public Paging(int totalCount, int curPage, int listCount) {
		this(totalCount, curPage);
		this.setListCount(listCount);
		
		makePaging();
	}

	// �� �Խñ� ���� ���� ������, �������� �Խñ� ��, ������ ���� �Է��ϴ� ������
	//	listCount == 10
	public Paging(int totalCount, int curPage, int listCount, int pageCount) {
		this(totalCount, curPage, listCount);
		this.setPageCount(pageCount);
		
		makePaging();
	}

	// ����¡ ���� ����
	private void makePaging() {
		if(totalCount == 0)	return; //�Խñ��� ���� ���
		if(curPage == 0)	setCurPage(1);	//�⺻������ ù ������(1) ����
		if(pageCount == 0)	setPageCount(10); //�� ȭ�鿡 ���̴� �������� �⺻��(10) ����
		if(listCount == 0)	setListCount(10); //�� ȭ�鿡 ���̴� �Խñۼ� �⺻��(10) ����
		
		// �� �������� ���
		totalPage = totalCount / listCount;
		if( totalCount % listCount > 0 )	totalPage++;

		// ���� �������� �� ���������� ũ�� �ԷµǸ�
		// ������ ������������ ����
		if (totalPage < curPage)	curPage = totalPage;
		
		
		// ȭ�鿡 ���� ���� ������ & �� ������ ���� 
		startPage = ((curPage-1)/pageCount)*pageCount+1;
		endPage = startPage+pageCount-1;

		// ���� ������ �������� totalPage���� Ŀ�� ���
		// ������ ���� ������������ ���̵��� ����
		if(endPage > totalPage)	endPage = totalPage;
		
		
		// �Խñ� ���۹�ȣ
		startNo = (curPage-1)*listCount+1;
		// �Խñ� ����ȣ
		endNo = curPage*listCount;
	}


	public int getCurPage() {
		return curPage;
	}

	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getListCount() {
		return listCount;
	}

	public void setListCount(int listCount) {
		this.listCount = listCount;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public int getStartNo() {
		return startNo;
	}

	public void setStartNo(int startNo) {
		this.startNo = startNo;
	}

	public int getEndNo() {
		return endNo;
	}

	public void setEndNo(int endNo) {
		this.endNo = endNo;
	}
	

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	@Override
	public String toString() {
		return "curPage="+curPage+
				", totalCount="+totalCount+
				", listCount="+listCount+
				", totalPage="+totalPage+
				", pageCount="+pageCount+
				", startPage="+startPage+
				", endPage="+endPage+
				", search ="+search+"]";
	}
}