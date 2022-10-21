
	import java.util.*;

	class Delivery  {
	    private static ArrayList<Edge>[] edgeList; // ���� ��������Ʈ
	    private static int[] distance; // 1�� ���ÿ� �ٸ� ���ð��� �ִ� ���

	    public int solution(int N, int[][] road, int K) { // N : ������ ����, road : ������ȣ�� ���, K : �ִ� ������ ���
	        int answer = 0;
	        //�ʱ�ȭ ����
	        edgeList = new ArrayList[N + 1];
	        distance = new int[N + 1];
	        Arrays.fill(distance, Integer.MAX_VALUE);
	        for (int i = 1; i <= N; i++) {
	            edgeList[i] = new ArrayList<>();
	        }
	        for (int i = 0; i < road.length; i++) {
	            edgeList[road[i][0]].add(new Edge(road[i][1], road[i][2]));
	            edgeList[road[i][1]].add(new Edge(road[i][0], road[i][2]));
	        }
	        distance[1] = 0; //1�� ���� - �ڽ� �ִ� ��� 0
	        //���ͽ�Ʈ��
	        dijkstra();
	        // 1���������� K ���� ����� ���� ���� ���ϱ�
	        for (int cost : distance) {
	            if (cost <= K) {
	                answer++;
	            }
	        }
	        return answer;
	    }

	    private static void dijkstra() {
	        PriorityQueue<Edge> queue = new PriorityQueue<>();  //���� ������ �켱 ���� -> 1
	        queue.add(new Edge(1, 0));
	        while (!queue.isEmpty()) {
	            Edge edge = queue.poll();
	            int vertex = edge.vertex;
	            int weight = edge.weight;
	            if (distance[vertex] < weight) {
	                continue;
	            }
	            for (int i = 0; i < edgeList[vertex].size(); i++) { // �ش� ���ÿ� ����� �ִ� ���õ� Ž��
	                int vertex2 = edgeList[vertex].get(i).vertex;
	                int weight2 = edgeList[vertex].get(i).weight + weight;
	                if (distance[vertex2] > weight2) { // �ִܰ�� ����
	                    distance[vertex2] = weight2;
	                    queue.add(new Edge(vertex2, weight2));
	                }
	            }
	        }
	    }
	    
	    private static class Edge implements Comparable<Edge> {
	        int vertex; //���
	        int weight; //����ֹ� �ð�

	        public Edge(int vertex, int weight) {
	            this.vertex = vertex;
	            this.weight = weight;
	        }

	        @Override
	        public int compareTo(Edge o) {
	            return weight - o.weight;
	        }
	    }
	}
